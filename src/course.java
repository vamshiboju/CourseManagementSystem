package oop;
import java.util.*;
import java.io.*;
//ArrayList<Integer> java=new ArrayList<>();
//ArrayList<Integer> DS=new ArrayList<>();
class pythoncourse implements Serializable{
	int serialVersionUID=123;
	ArrayList<Integer> python=new ArrayList<>();
	ArrayList<Integer> java=new ArrayList<>();
	ArrayList<Integer> ds=new ArrayList<>();
}
class courses  
{
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)); 
	Scanner sc1=new Scanner(System.in);
	//ArrayList<Integer> al1=new ArrayList<>();
	void display1(String user) throws IOException 
	{
		System.out.println("1-python for everybody\n2-java programming\n3-data structures");
		System.out.println("enter your choice:");
		int ch=sc1.nextInt();
		BufferedWriter out = new BufferedWriter( new FileWriter(new File("C:\\java\\coursedetails.txt"),true));
		switch(ch)
		{
		case 1:
			//System.out.println(user);
			out.write(user+","+"python"+"\n");
			System.out.println("------------python course enrolled successfully----------");
			System.out.println("-----------complete course in next 48hrs to earn certificate----------");
			break;
		case 2:
			out.write(user+","+"java"+"\n");
			System.out.println("-------------java course enrolled successfully---------------");
			System.out.println("-----------complete course in next 48hrs to earn certificate----------");
			break;
		case 3:
			out.write(user+","+"ds"+"\n");
			System.out.println("-------------ds course enrolled successfully----------------");
			System.out.println("-----------complete course in next 48hrs to earn certificate----------");
			break;
		default :
			System.out.println("Invalid input");
			break;
		}
		out.flush();
		out.close();
	}
	pythoncourse deserializepython()throws IOException, ClassNotFoundException
	{
		pythoncourse py;
		 FileInputStream fileIn = new FileInputStream("C://java//pythoncourse.txt");
		 if(fileIn.available()==0)
		 {
			 py=new pythoncourse();
			 return py;
		 }
	      ObjectInputStream in = new ObjectInputStream(fileIn);
	        py= (pythoncourse) in.readObject();
	        in.close();
	        fileIn.close();
//		if(py==null)
//			py=new pythoncourse();
		return py;
	}
	pythoncourse deserializejava()throws IOException, ClassNotFoundException
	{
		pythoncourse py;
		 FileInputStream fileIn = new FileInputStream("C://java//javacourse.txt");
		 if(fileIn.available()==0)
		 {
			 py=new pythoncourse();
			 return py;
		 }
	      ObjectInputStream in = new ObjectInputStream(fileIn);
	        py= (pythoncourse) in.readObject();
	        in.close();
	        fileIn.close();
//		if(py==null)
//			py=new pythoncourse();
		return py;
	}
	pythoncourse deserializeds()throws IOException, ClassNotFoundException
	{
		pythoncourse py;
		 FileInputStream fileIn = new FileInputStream("C://java//dscourse.txt");
		 if(fileIn.available()==0)
		 {
			 py=new pythoncourse();
			 return py;
		 }
	      ObjectInputStream in = new ObjectInputStream(fileIn);
	        py= (pythoncourse) in.readObject();
	        in.close();
	        fileIn.close();
//		if(py==null)
//			py=new pythoncourse();
		return py;
	}
	void display2(String user) throws IOException, ClassNotFoundException 
	{
		String temp2;
		String temp1;
		int flage=0;
		pythoncourse py=null;
		//pythoncourse py=new pythoncourse();
		BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\java\\coursedetails.txt")));
		System.out.println("The courses you enrolled are:");
		while ((temp2 = reader.readLine()) != null) {
			String[] details = temp2.split(",");
			//System.out.println(details[0]);
			if (user.equals(details[0])) {
				System.out.println("<<<"+details[1]+">>>");
				flage=1;
			}
		}
		if(flage==0)
		{
			System.out.println("no courses enrolled");
		}
		if(flage==1)
		{
			System.out.println("enter the course name that you enrolled:");
			String coursename=sc.readLine();
			System.out.print("enter the week out of 3:");
			int n=sc1.nextInt();
			if(n>3)
			{
				System.out.println("course contains only 3 weeks");
			}
			else
			{
				if (coursename.equals("python")) {
					py=deserializepython();
					if(!py.python.contains(n)) {
						py.python.add(n);}
					Collections.sort(py.python);
					if(n==1) {
						String fulltext = "";
						BufferedReader reader1 = new BufferedReader(new FileReader(new File("C:\\java\\pythonweek1.txt")));
						while ((temp1 = reader1.readLine()) != null) {
							System.out.println(temp1);
							fulltext += temp1;
						}
						reader1.close();
					}
					if(n==2) {
						String fulltext = "";
						BufferedReader reader1 = new BufferedReader(new FileReader(new File("C:\\java\\pythonweek2.txt")));
						while ((temp1 = reader1.readLine()) != null) {
							System.out.println(temp1);
							fulltext += temp1;
						}
						reader1.close();
					}
					if(n==3) {
						String fulltext = "";
						BufferedReader reader1 = new BufferedReader(new FileReader(new File("C:\\java\\pythonweek3.txt")));
						while ((temp1 = reader1.readLine()) != null) {
							System.out.println(temp1);
							fulltext += temp1;
						}
						reader1.close();
					}
					FileOutputStream fileOut =new FileOutputStream("C:\\java\\pythoncourse.txt");
				    ObjectOutputStream out = new ObjectOutputStream(fileOut);
				    out.writeObject(py);
				    out.close();
				    fileOut.close();
				}
				if (coursename.equals("java")) {
					py=deserializejava();
					if(!py.java.contains(n)) {
						py.java.add(n);}
					Collections.sort(py.java);
					if(n==1) {
						String fulltext = "";
						BufferedReader reader1 = new BufferedReader(new FileReader(new File("C:\\java\\javaweek1.txt")));
						while ((temp1 = reader1.readLine()) != null) {
							System.out.println(temp1);
							fulltext += temp1;
						}
						reader1.close();
					}
					if(n==2) {
						String fulltext = "";
						BufferedReader reader1 = new BufferedReader(new FileReader(new File("C:\\java\\javaweek2.txt")));
						while ((temp1 = reader1.readLine()) != null) {
							System.out.println(temp1);
							fulltext += temp1;
						}
						reader1.close();
					}
					if(n==3) {
						String fulltext = "";
						BufferedReader reader1 = new BufferedReader(new FileReader(new File("C:\\java\\javaweek3.txt")));
						while ((temp1 = reader1.readLine()) != null) {
							System.out.println(temp1);
							fulltext += temp1;
						}
						reader1.close();
					}
					FileOutputStream fileOut =new FileOutputStream("C:\\java\\javacourse.txt");
				    ObjectOutputStream out = new ObjectOutputStream(fileOut);
				    out.writeObject(py);
				    out.close();
				    fileOut.close();
				}
				if (coursename.equals("ds")) {
					py=deserializeds();
					if(!py.ds.contains(n)) {
						py.ds.add(n);}
					Collections.sort(py.ds);
					if(n==1) {
						String fulltext = "";
						BufferedReader reader1 = new BufferedReader(new FileReader(new File("C:\\java\\dsweek1.txt")));
						while ((temp1 = reader1.readLine()) != null) {
							System.out.println(temp1);
							fulltext += temp1;
						}
						reader1.close();
					}
					if(n==2) {
						String fulltext = "";
						BufferedReader reader1 = new BufferedReader(new FileReader(new File("C:\\java\\dsweek2.txt")));
						while ((temp1 = reader1.readLine()) != null) {
							System.out.println(temp1);
							fulltext += temp1;
						}
						reader1.close();
					}
					if(n==3) {
						String fulltext = "";
						BufferedReader reader1 = new BufferedReader(new FileReader(new File("C:\\java\\dsweek3.txt")));
						while ((temp1 = reader1.readLine()) != null) {
							System.out.println(temp1);
							fulltext += temp1;
						}
						reader1.close();
					}
					FileOutputStream fileOut =new FileOutputStream("C:\\java\\dscourse.txt");
				    ObjectOutputStream out = new ObjectOutputStream(fileOut);
				    out.writeObject(py);
				    out.close();
				    fileOut.close();
				}
				//pythoncourse py=null;
				if(coursename.equals("python"))
				{
					System.out.println("In python course");
					for(int j : py.python)
					{
						System.out.println("--->week"+j+" completed<-----");
					}
				}
				if(coursename.equals("java"))//C:\\java\\pythonweek1.txt
				{
					System.out.println("In java course");
					for(int j : py.java)
					{
						System.out.println("--->week"+j+" completed<-----");
					}
				}
				if(coursename.equals("ds"))
				{
					System.out.println("In ds course");
					for(int j : py.ds)
					{
						System.out.println("--->week"+j+" completed<-----");
					}
				}
				System.out.println("do you want to continue(yes/no)");
				String c=sc.readLine();
				if(c.equals("yes"))
				{
					display2(user);
				}
				
			}
		}
		
	}
}
class details
{
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)); 
	Scanner sc1=new Scanner(System.in);
	public void signup() throws IOException
	{
		//BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)); 
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.readLine();
		System.out.println("enter your mobile number");
		String mobile=sc.readLine();
		System.out.println("enter your Gmail");
		String user=sc.readLine();
		System.out.println("set your password");
		String pass=sc.readLine();
		BufferedWriter out = new BufferedWriter( new FileWriter(new File("C:\\java\\details.txt"),true));
		out.write(user+","+pass+","+name+","+mobile+"\n");
		out.flush();
		out.close();
		System.out.print("\n--------------Your account is created successfully--------------\n");
	}
}
class account extends courses
{
	public void login () throws IOException, ClassNotFoundException
	{
		String temp2;
		int flage=0;
		int map=0;
		System.out.print("Enter Gmail: ");
		String username = sc.readLine();
		System.out.print("Password: ");
		String pass = sc.readLine();
		BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\java\\details.txt")));
		while ((temp2 = reader.readLine()) != null) {
			String[] details = temp2.split(",");
			//System.out.println(details[0]);
			if (username.equals(details[0])) {
				if (!pass.equals(details[1])) {
					System.out.println("Invalid Gmail/password");
					flage=1;
					break;
				}
				break;
			}
		}
		if (temp2 == null) 
		{
			System.out.print("\nInvalid Account\n");
		} 
		else if(flage==1)
		{
			System.out.println("Enter password correctly");
		}
		else 
		{
			System.out.println("------logged in Successfully---------");
			courses cs=new account();
			while(true)
			{
				System.out.println("1-Enroll courses\n2-your courses\n3-Log out");
				System.out.println("Enter your choice: ");
				int i=sc1.nextInt();
				switch(i)
				{
				case 1:
					cs.display1(username);
					break;
				case 2:
					cs.display2(username);
					break;
				case 3:
					map=1;
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
				if(map==1)
				{
					break;
				}
			}
		}
	}
}
public class course {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("1-login\n2-signup\n3-exit\n");
			System.out.print("Enter your choice:");
			account acc=new account();
			details l=new details();
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				acc.login();
				break;
			case 2:
				l.signup();
				break;
			case 3:
				System.exit(0);
				break;
			default :
				System.out.println("Invalid input");
				break;
			}
		}
	}
}


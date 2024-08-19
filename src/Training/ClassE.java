package Training;

import java.util.Scanner;

public class ClassE 
{
	static Scanner sc = new Scanner(System.in);
 void meth1()
 {
	// Scanner sc = new Scanner(System.in);
	 System.out.println("meth 1 called");
	 
	 System.out.println("Enter 1st number");
	 int x = sc.nextInt();
	 System.out.println("\n x value : " + x);
	 
	 System.out.println("Enter 2nt number");
	 int y = sc.nextInt();
	 System.out.println("\n y value : " + y);
	 
	 int z= x+y;
	 System.out.println("\n z value : " + z);
	// sc.close();
 }
	 
 void checkeligability()
 {
	 
		System.out.println("check your eligablity for vote");
		System.out.println("what is your name");
		String name = sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age >= 18)
		{
			System.out.println(name + " your eligable for voting");
		}
		else
		{
			System.out.println(name + " your not eligable foe voting");
		}
	 }
 String matrimony(String name , int age , String requirement)
 {
	 System.out.println("candidate details");
	 System.out.println();
	 System.out.println("name : " + name);
	 System.out.println("age : "+  age );
	 System.out.println("Requirement : " + requirement );
	 
	 return sc.nextLine();
 }
		
	
public static void main(String[] args)
 {
	//new ClassE().meth1();
	//new ClassE().checkeligability();
	ClassE aobj=new ClassE();
	
	System.out.println("welcome to matrimony");
	System.out.println();
	System.out.println("Are you sure you want a married? (yes/No)");
	String name =" ";
	int age = 0;
	String Requirement = " ";
	 
	int i =1;
	switch(sc.next())
	{
	case "yes":
	System.out.println("ok please fill the below info");
	System.out.println("Enter your name");
	name = sc.next();
	
	System.out.println("Enter your age");
	age = sc.nextInt();
	
	System.out.println("what is your requirement");
	Requirement = sc.next();
	
	System.out.println("\n======wait a moment======");
	
	break;
	
	
 case "No":
 
	System.out.println("good decision ...!!! see you later"); 
	i++;
	break;
 
	default:
		System.out.println("Invalied data");
	
 }
 if (i==1)
 {
	// String fees = aobj.matrimony(name, age,Requirement);
	 System.out.println(aobj.matrimony(name, age,Requirement));
 }
 else
 {
	 System.out.println("please refer your friends");
 }
 }
}

package oop;

import java.util.Scanner;

public class ClassB
{
void meth1()
{   
	Scanner sc = new Scanner(System.in);
	ClassA aobj=new ClassA();
	System.out.println("Enter your name ");
	//aobj.empname=sc.next();
	aobj.setEmpname(sc.next());
	
	System.out.println("Enter your ID ");
	//aobj.empid =sc.nextInt();
	aobj.setEmpid(sc.nextInt());
	
	System.out.println("Enter your Dept");
	//aobj.empdept=sc.next();
	aobj.setEmpdept(sc.next());
	
	System.out.println("=======EmpDetails========");
	
	//System.out.println("Employee name " + aobj.empname);
	System.out.println("Employee name " + aobj.getEmpname());
	//System.out.println("Employee id " + aobj.empid);
	System.out.println("Employee id " + aobj.getEmpid());
	//System.out.println("Empdept " + aobj.empdept);
	
	System.out.println("Employee Dept " + aobj.getEmpdept());
	
}
public static void main(String[] args)
{
	new ClassB().meth1();
}
}

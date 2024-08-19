package oop;

import java.util.Scanner;

public class Encp2 
{
 void meth1()
 {
	 Scanner sc = new Scanner(System.in);
	 Encp a=new Encp();
	 
	 System.out.println("Enter your name");
	 a.setName(sc.next());
	 
	 System.out.println("Enter your age");
	 a.setAge(sc.nextInt(10));
	 
	 System.out.println("Enter your email");
	 a.setEmail(sc.next());
	 
	 System.out.println("====details===");
	 System.out.println("name : " + a.getName());
	 System.out.println("age : " + a.getAge());
	 System.out.println("email : "+ a.getEmail());
	 
	 sc.close();
 }
 public static void main(String[] args)
 {
	Encp2 a= new Encp2();
	a.meth1();
}
	
}

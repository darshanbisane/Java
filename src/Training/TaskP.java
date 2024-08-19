package Training;

import java.security.DomainCombiner;

public class TaskP 
{
 void implicit()
 {
	 byte b=10;
	 System.out.println("byte value is " + b);
	 short s= b;
	 System.out.println("short value is " + s);
	 s++;
	 
	 int i=s++;
	 System.out.println("int value is " + i);
	 System.out.println("short value is " + s);
	 
	 long l=i;
	 System.out.println("long value is :" +(--l));
	 float f=1;
	 System.out.println("The value of float is " +(f+b));
	 double d=(--f);
	 System.out.println("the value of double is " + d);
	 show();
	 
	 if(!(d==f))
	 {
		System.out.println("equal"); 
	 }
	 else
	 {
		 System.out.println("not equal");
	 } 
 }
 public static void main(String[] args) 
 {
	TaskP a=new TaskP();
	a.implicit();
}
 static void show()
 {
	 char c='A';  //ASCII VALUE A=65
	 int a= ++c;
	 System.out.println(a); //66
	 TaskP b=new TaskP();
	 System.out.println(b.meth1());
	 
 }
 String meth1()
 {
	 String s="Implicit type casting is done by compiler automatically";
	 return s;
 }
}

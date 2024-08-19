package oop;
 // ==============overloading=============
public class poly1 
{
 int meth1(int i)
 { 
	 System.out.println(20);
	 return i;
 }
 /*void meth1()
 {
	System.out.println(30); 
 }*/
 private static void meth1()
 {
	 System.out.println(40);
 }
 static protected void meth1(int i ,String s)
 {
	 System.out.println(50);
 }
 String meth1(String i)
 {
	 System.out.println(60);
	 return "S";
 }
 StringBuffer meth1(StringBuffer sb)
 {
	 System.out.println(70);
	 return sb;
 }
 private void meth1(byte s)
 {
	 System.out.println(80);
 }
 public static void main(String[] args)
 {
	poly1  aobj=new poly1();
	aobj.meth1(100);
	aobj.meth1();
	aobj.meth1(500, "java");
	aobj.meth1("Accenture");
	aobj.meth1(new StringBuffer("java"));
	aobj.meth1((byte)100);
	
	main();
	main("java");
	
}
 public static void main() 
 {
	System.out.println("meth 1st");
}
 public static void main(String s )
 {
	System.out.println("meth 2nd");
}
 poly1()
 {
	 this("java is my friend");
	 System.out.println("i am a constructor");
 }
 poly1(String f)
 {
	 System.out.println("=====overloading concept===== ");
	 System.out.println("\nI am a payametrised constructor " + f);
	 
 }
}

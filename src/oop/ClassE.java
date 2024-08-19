package oop;

public class ClassE
{
private static void meth1()
{
	System.out.println(10);
}
int meth1(int i)
{
	System.out.println(20);
	return i ;
}
static protected void meth1(int i , String s)
{
	System.out.println(30);
}
String meth1(String s, int i)
{
	System.out.println(40);
	return s;
}
static public void meth1(String s)
{
	System.out.println(50);
}
StringBuffer meth1(StringBuffer sb)
{
	System.out.println(10);
	return sb;
}
private void meth1(byte b)
{
	System.out.println(70);
}
public static void main(String[] args) 
{  
	ClassE aobj=new ClassE();
	aobj.meth1();
	aobj.meth1(100);
	aobj.meth1(100 , "java");
	aobj.meth1("java");
	aobj.meth1(new StringBuffer("java"));
	aobj.meth1((byte) 100);
	
	main();
	main("java");
	
}
public static void main()
{
	System.out.println("1st main()");
}
public static void main(String S) 
{
	System.out.println("2nd main()");
}
ClassE()
{ 
	this("java is awasome");
	System.out.println("Class E is a default constructor");
}
ClassE(String s)
{
	System.out.println("ClassE is an parametrised constructor " + s);
}
}

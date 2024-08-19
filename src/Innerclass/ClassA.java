package Innerclass;
//nested inner class
public class ClassA 
{
 private void meth1()
 {
	 System.out.println("outer class method");
 }
 static
 {
	System.out.println("outer static class method"); 
 }
 ClassA()
 {
	 System.out.println("outer class constructor");
 }
 {
	 System.out.println("outer instant class method");
 }
 
 class Innerclass
 {
	void show()
	 {
		System.out.println("inner class method"); 
	 }
	Innerclass()
	{
		System.out.println("inner class constructor");
	}
	{
		System.out.println("inner class instant meth");
	}
 }
 public static void main(String[] args)
 {
	 System.out.println("outer class meth");
	 ClassA.Innerclass a= new ClassA().new Innerclass();
	 a.show();
	//new ClassA().meth1(); 
	 
}
}

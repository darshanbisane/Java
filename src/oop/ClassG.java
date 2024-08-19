package oop;

public class ClassG extends ClassF
{
 void meth2()
 {
	 System.out.println("class B is called");
 }
 public static void main(String[] args) 
 {
	ClassF aobj=new ClassF(); 
	aobj.meth1();
	
	ClassF aobj2=new ClassG();
	aobj2.meth1();
	
	ClassG bobj = new ClassG();
	bobj.meth2();
	bobj.meth1();
	
//	ClassG bobj2 = new ClassF();   --- invalid
}
 
}

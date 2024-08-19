package oop;

public abstract class Abstract 
{
  abstract void meth1 ();
  abstract void meth1(String S); // overload
  
  void meth2()
  {
	  System.out.println("meth2() called");
  }
  static void meth3()
  {
	  System.out.println("static meth called");
  }
   Abstract()
   {
	   System.out.println("Abstarct() constract call");
   }
   public static void main(String[] args)
   {
	System.out.println("main method called");
	
	 //Abstract aobj=new Abstract(); // we can't instantiate the abstract class
	Abstract.meth3(); 
   }
 
}

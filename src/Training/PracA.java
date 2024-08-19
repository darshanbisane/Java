package Training;
// Understanding Instance, static, Local concept code
public class PracA 
{
	
	 int x=10;  // instance variable
	 static int y=20; // static variable
	 
	 int a;  
	 static boolean flag;
	 
 public void meth1()
 {
	 int z=30;
	 System.out.println("meth1() called");
	 System.out.println("Instance veriable x :"+ x); // using identifier
	 System.out.println("Instance veriable x :" + new PracA().x); // using class object
     
	 System.out.println("Static variable y :" + y); // using identifier
	 System.out.println("Static variable y :" + new PracA().y); // using class object
	 System.out.println("Static variable y :" + PracA.y); // Using class name
	 
	 System.out.println("Local veriable z :" + z); //using identifier
 }
  public void meth2()
  {
	   int x= 50;
	   int y= 100;
	   
	   System.out.println("meth2() called");
	   System.out.println("Instance veriable x :" + x);
	   System.out.println("Static variable y :" + y);
	   //System.out.println("Local variable z :" + z);
	   
	   System.out.println("Local veriable x : "+x+" y:" + y);   
  }
  
  void meth3()
  {
	  int i ;   // local variable
	  System.out.println("meth3() called");
	  System.out.println("Instance veriable a :" + a);
	  System.out.println("static veriable flag :" + flag);
	  //System.out.println("\n local variable i :"+ i);  
  }
 public static void main(String[] args)
 {
	 new PracA().meth1();
	 System.out.println("=============");
	 new PracA().meth2();
	 System.out.println("=============");
	 new PracA().meth3();
 }
}

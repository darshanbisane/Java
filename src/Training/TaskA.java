package Training;

public class TaskA 
{
 public int meth1(int a,int b)
 {
	 System.out.println("Addition: " + (a+b));
	 new TaskA().meth2(20, 5);
	 return a;	 
	 
 }
 int meth2(int a, int b)
 {
	 System.out.println("Substraction: "+ (a-b));
	 new TaskA().meth3(5, 5);
	 return b;
 }
  int meth3 (int a, int b)
  {
	  System.out.println("Multipliction: "+ (a*b)); 
	  new TaskA().meth4(20,5);
	  return a;
  }
  int meth4 (int a, int b)
  {
	  System.out.println("Division: "+ (a/b));
	  return b;
  }
  public static void main(String[] args)
  {
	//TaskA aobj=new TaskA();
	  new TaskA().meth1(5, 5);
}
}

/* 1. In a java program you should write 4 method
 * 2.All the 4  method should parameterized method
 * 3.From main() method you should call only one method but all the four method
 * should be getting executd*/
 


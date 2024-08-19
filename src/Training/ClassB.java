package Training;

public class ClassB
{
  public int meth1(int a)
{
  System.out.println("hello India");
  return a;
}
  void meth2()
  {
	  System.out.println("Java is wonderful..!");
  }
  int meth3()
  {
	  System.out.println("That correct");
	  return 0;
  }
  public static void main(String[] args) 
  {
	new ClassB().meth1(50);
	new ClassB().meth2();
	new ClassB().meth3();  
  }
  
}

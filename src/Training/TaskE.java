package Training;

public class TaskE 
{
  int display(int a)
  {
	  System.out.println(10);
	  return a;
  }
  int show()
  {
	  System.out.println(20);
	  return new TaskE().display(100);
  }
  int meth1(int x,int y)
  {
	  return x+y;
  }
  int meth2(int x)
  {
	  return x*2;
  }
  int meth3(int x,int y,int z)
  {
   System.out.println("Java is awesome");
  return x+y+z;
  }
  int meth4()
  {
	  return 5;
  }
  public static void main(String[] args) 
  {
	TaskE eobj=new TaskE();
	System.out.println(eobj.display(eobj.meth1(49, 1)+eobj.meth2(10)-
			eobj.meth3(10, 10, 5)+10-eobj.meth4()));
	System.out.println(new TaskE().show());
}
}

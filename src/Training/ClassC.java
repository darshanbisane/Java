package Training;

public class ClassC 
{
 void meth1()
 {
	 System.out.println(10);
	 new ClassC().meth2();
	 System.out.println("Hi");
 }
 void meth2()
 {
	 System.out.println(20);
	 System.out.println("Hello");
 }
  public static void main(String[] args) 
  {
	System.out.println("Start");
	ClassC aobj=new ClassC();
	aobj.meth1();
	System.out.println("java is awesome");
  }
}

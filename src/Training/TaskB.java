package Training;

public class TaskB 
{
 String meth1(int a, int b) // calling meth4 a=4,b=8
 {
	 System.out.println(10);
	 System.out.println((54+a)-b);
	 System.out.println(new TaskB().meth5());
	 return "java";
 }
 int meth2(int a) // calling meth5 a=5
 {
	 System.out.println(75);
	 int b=5;
	 System.out.println(b-a);
	 return (5*5)-b;
 }
 void meth3() // main()
 {
	 System.out.println("start");
	 System.out.println(new TaskB().meth4());
	 System.out.println(40);
 }
 String meth4() // meth3()
 {
	 System.out.println("Today is tuesday");
	 return new TaskB().meth1(4, 8);
 }
 int meth5() // calling meth1()
 {    
	  
	 System.out.println(99);
	 return new TaskB().meth2(5);  // 1st way to call meth
	 
	 //TaskB obj = new TaskB();     //   2nd way to call meth
	// return obj.meth2(5);
 }
 public static void main(String[] args)
 {
	TaskB aobj=new TaskB();
	aobj.meth3();
}
}

package Training;

public class TaskF 
{
 public TaskF()  // constructor & Always remember Constructor name same as Class Name
 {
	 System.out.println("Sunday");
	 TaskF obj=new TaskF(10);  // main
	 System.out.println("Tuesday");
	// String S = obj.display("practice");  way 1st
	// System.out.println(S);
	 
	 System.out.println(obj.display("practic")); // way 2nd
	 
 }
 public TaskF(int temp) // temp = 10  // line 8
 {
	 System.out.println("Saturday");
	 TaskF obj=new TaskF(10,20);  
	 int a = obj.meth1()+temp;  // 100+ 10 = 110
	 System.out.println("===>" + (a+ obj.meth2())); // 110+99 = 209
	 System.out.println("Monday");
 }
 String display(String S)
 {
	 System.out.println("In the next statement i am returning the vcalue");
	  return S;
 }
 int meth1()
 {
	 return 100;
 }
 int meth2()
 {
	 return 99;
 }
 
 public TaskF(int data, int temp)  // data = 10 , temp 20 // line 14
 {
	 System.out.println("Thursday");
	 System.out.println("===>" + (data + new TaskF("HI").meth2()- temp)); //(10 + 99 -20 )
	 
 }
 TaskF(String S)
 {
	 System.out.println(S);
 }
 public static void main(String[] args)
 {
	TaskF obj=new TaskF();
	System.out.println("output verified");
}
}

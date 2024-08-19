package Training;

public class TaskC 
{
 int meth1(int a, int b)
 {
	 System.out.println("The value of a:"+ a);
	 System.out.println("The value of b:"+ b);
	 System.out.println(new TaskC().meth2(7 , "Ms.Dhoni"));
	 return a;  // a=100
	 
 }
 
 int meth2(int J, String k) // meth 1  
 {
	 System.out.println(J + k);
	 System.out.println(new TaskC().meth3(22, " CSK"));
	 return J;  // J= 7
 }
 int meth3(int a , String d)  // meth 2 // a=22 , d=csk
 {
	 System.out.println("IPL 2024 Starting on "+ (a+d));
	 System.out.println(new TaskC().meth4("CSK ", " RCB")+ "will win");
	 return a; // a=22
 }
 String meth4(String p, String q)
 {
	 System.out.println("First match bet teams: " +(p+q));
	 return p;
 }
 public static void main(String[] args) 
 {
	System.out.println(new TaskC().meth1(100,150));
}
}
	
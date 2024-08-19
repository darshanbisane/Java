package Training;

public class TaskH
{
 void meth1(int a, int b, int c)
 {
	 System.out.println("Addition: " + (a+b+c));
	 new TaskH().meth2(8, 4);
 }
 void meth2(int p , int q)
 {
	 System.out.println("Substraction: " + (p-q));
 }
 TaskH()
 {
	 System.out.println("division: " + (10/2));
 } 
 TaskH(int num )
 {
	 System.out.println("Multiplaction: " + (num*2));
 }
 public static void main(String[] args)
 {
	new TaskH(5).meth1(1, 2, 3);
}
}

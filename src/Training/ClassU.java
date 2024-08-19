package Training;

public class ClassU 
{
 void meth1(int i)
 {
	 System.out.println("----meth1-------");
	 
	 if(i<=100)
	 {
		System.out.println(i++); 
	 }
	    System.out.println(i);
	    System.out.println("meth1() executed complated");
 }
 void meth2(int i)
 {
	 System.out.println("-----meth2-----");
	 
	 if(i<=10)
	 
		System.out.println(i++);
		System.out.println(i);
	 System.out.println("meth2) executed complated");
 }
 int meth3(int i)
 {
	 System.out.println("----meth3-----");
	 if(!(i<= 100))
	 
		  return 10; 
		 System.out.println("hi");
		 //return 10;
		 return 20;	  
 }
 void meth4(int i)
 {
	 System.out.println("---meth4-----");
	 if((i <= new ClassU().meth3(5)))
	 {
		System.out.println("if block executed");
		System.out.println("heyy");
	 }
	 else
	 {
		System.out.println("else block executed");
		System.out.println("hello");
	 }
 }
 void meth5(int i)
 {
	 System.out.println("----meth5()----");
	 if(true)
	 {
		 System.out.println("hi");
	 }
	 else
	 {
		System.out.println("hello"); 
	 }
	 System.out.println("meth5() executed complated");
 }
 void meth6(int i)
 {
	 System.out.println("----meth6()----");
	 if(i>0)
		 System.out.println(i + " is a positive number");
	 else if(i< 0)
	 
		 System.out.println(i + " is a negative number");
	 else
		 System.out.println(i + " is a equal to 0");
	 System.out.println("meth6() ececuted complated");
	 
 }
 public static void main(String[] args)
 {
	ClassU obj=new ClassU();
	obj.meth1(10);
	obj.meth2(1);
	obj.meth3(10);
	obj.meth4(10);
	obj.meth5(10);
	obj.meth6(0);
}
}

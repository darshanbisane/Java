package oop;

public class overriding1 extends overriding
{
	//override
 void meth1()
 {
	 System.out.println(10);
 }
  //override
 int meth2( int i)
 {
	 System.out.println(20);
	 return 2000;
 }
  //override
 protected void meth3(int i , String S )
 {
	 System.out.println(50);
 }
 void meth1(char a)
 {
	 System.out.println(40);
 }
 // override
 public void meth4()
	{
		System.out.println(701);
	}
 public static void main(String[] args)
 {
	 overriding aobj =new overriding();
	 aobj.meth1();
	 System.out.println("=====================");
	 
	 overriding bobj= new overriding1();
	 bobj.meth1();
	 bobj.meth2(2000);
	 bobj.meth3(66, null);
	 bobj.meth4();
	 
}
}

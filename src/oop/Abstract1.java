package oop;

public class Abstract1 extends Abstract
{
	@Override
   void meth1()
  {
	  System.out.println("Abstarct meth1 Override");
  }
	@Override
	void meth1(String S)
	{
		System.out.println("Really : " + S);
	}
	public static void main(String[] args)
	{
		Abstract bobj=new Abstract1();
		bobj.meth1();
		bobj.meth1("Java is awesome");
		bobj.meth2();
	}
}

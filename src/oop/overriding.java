package oop;

public class overriding 
{
	void meth1()
	{
		System.out.println(" Calss A meth1()");
	}
	
	int meth2(int i)
	{
		System.out.println(" Calss A meth2()");
		return 100;
	}
	protected void meth3(int i , String S )
	{
		System.out.println("Calss A meth3()");
	}
	public void meth4()
	{
		System.out.println(" Calss A meth4()");
	}
	static void meth5()
	{
		System.out.println(" Calss A meth5()");
	}
	overriding meth6()
	{
		System.out.println(" Calss A meth6()");
		return new overriding();
	}

}

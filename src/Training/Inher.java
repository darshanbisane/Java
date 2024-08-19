package Training;

import oop.ClassI;

public class Inher extends ClassI
{
	void meth3()
	{
		System.out.println("meth 3 called ");
	}
	public static void main(String[] args)
	{
		 Inher aobj=new Inher();
		 aobj.meth();
		 aobj.meth2();
		 aobj.meth3();
	}
	
}

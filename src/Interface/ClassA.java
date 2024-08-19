package Interface;

public  class ClassA implements InterfaceA
{
	@Override
 public void meth1()
 {
	 System.out.println("Inteface abstarct A meth exe");
 }
	public static void main(String[] args) 
	{
		InterfaceA aobj= new ClassA();
		aobj.meth1();
	}
}

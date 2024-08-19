package Innerclass;
//anonymous classes
public class ClassC 
{
void meth1()
{
	System.out.println("meth1() called");
}
void show()
{
	System.out.println("i love India");
}
public static void main(String[] args) 
{
	ClassC b=new ClassC()
	{
		
	@Override
		void meth1()
		{
			System.out.println("java is awesome");
			super.show();//
		}
	
};
b.meth1();
}

}





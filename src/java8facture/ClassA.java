package java8facture;
import Interface.InterfaceA;

public class ClassA 
{
void display()
{
	System.out.println("Implementing lambda expression");
	
	InterfaceA x=() -> System.out.println("hello words");
	x.meth1();
	
	InterfaceB y= (int num1, int num2)->System.out.println("\nAddition :" + (num1 + num2));
	y.meth2(44, 44);
	
	InterfaceC z= (int num3, int num4)->
	{
		if(num3 >= 10)
		{
			System.out.println("if block executed");
			return num3 +11;
		}
		else
		{
			System.out.println("else block executed");
			return num4 + 55;
		}
		
	};
	
	int i = z.meth3(5, 10);
	System.out.println("method3() is returning :"+i);
}
public static void main(String[] args)
{
	new ClassA().display();
}
}

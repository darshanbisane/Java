package java8facture;

public class ClassB
{
void mobile()
{
	System.out.println("Implementing lambda expression");
	
//	InterfaceD aobj = (int num) ->  // 1st way
//	{
//	System.out.println("\nnum value:" + num);
//	System.out.println("Additional :" + (num +100));
//	};
	
//	InterfaceD aobj = ( num) ->  // 2nd way
//	{
//	System.out.println("\nnum value:" + num);
//	System.out.println("Additional :" + (num +100));
//	};
	
	InterfaceD aobj =  num ->  // 3rd way
	{
	System.out.println("\nnum value:" + num);
	System.out.println("Additional :" + (num +100));
	};
	
	aobj.meth1(100);
	
	System.out.println("==========================");
	
	//InterfaceE bobj =(int num2 ,int num3) -> System.out.println("additional :"+(num2 + num3)); //1st way
	InterfaceE bobj =(num2 , num3) -> System.out.println("additional :"+(num2 + num3)); //2nd way
	
	//InterfaceE bobj =num2 ,num3 -> System.out.println("additional :"+(num2 + num3)); //3rd way ce

    bobj.meth2(55, 44);
}
public static void main(String[] args)
{
	new ClassB().mobile();
}
}

package oop;

public class MathOperations 
{
int addNumbers(int a , int d)
{
	//System.out.println("Sum of 5 and 7: " + addNumbers(5, 7));
	return a+d;
}
double addNumbers(double a , double d)
{
	//System.out.println("Sum of 3.5 and 2.5: " + addNumbers(3.5, 2.5));
	
	return a+d;
}
String addNumbers(String a , String d)
{
	//System.out.println("Concatenation: " + addNumbers("Hello", " Java"));
	return  a + d;
}
int addNumbers(int [] numbers)
{
	int sum = 0;
	for(int num : numbers ) 
	{
	num += sum;
	}
	return sum;
}
public static void main(String[] args) 
{
	MathOperations aobj = new MathOperations();
	
	System.out.println("Sum of 5 and 7: " + aobj.addNumbers(5, 7));
	
	System.out.println("Sum of 3.5 and 2.5: " + aobj.addNumbers(3.5, 2.5));
	
	System.out.println("Concatenation: " + aobj.addNumbers("Hello", " Java"));
	
	
	/*aobj.addNumbers(5,7);
	aobj.addNumbers(3.5,2.5);
	aobj.addNumbers("Hello", "Java");*/
	System.out.println(aobj.addNumbers(5, 5));;
	
}
}

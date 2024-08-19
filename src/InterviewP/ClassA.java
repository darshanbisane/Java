package InterviewP;

import java.util.Arrays;

public class ClassA 
{
void meth1()
{
	String msg= "java is awesome";
	
	String[] arr= msg.split(" ");
	
	for(int i = arr.length-1; i >=0; i--)
	{
		System.out.print(arr[i].toUpperCase() + " ");
	}
}
public static void main(String[] args) 
{
	new ClassA().meth1();
}
}



package CollectionFW;

import java.util.ArrayList;
import java.util.Scanner;

public class task 
{
void meth1()
{
	Scanner sc=new Scanner(System.in);
	ArrayList al=new ArrayList<Integer>();
	
	System.out.println("enter 5 number");
	for(int i=1;i<= 5;i++)
	{
		al.add(sc.nextInt());
	}
	System.out.println("al :" + al);
	sc.close();
}
void meth2()
{
	Scanner sc=new Scanner(System.in);
	ArrayList al=new ArrayList<String>();
	System.out.println("enter 5 String");
	 
		al.add(sc.next());
		System.out.println("al :" + al);
		sc.close();
	
}
public static void main(String[] args)
{
	//new task().meth1();
	new task().meth2();
	
}
}

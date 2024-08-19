package Training;


import java.util.Arrays;
import java.util.Scanner;

public class ClassF 
{
	Scanner sc = new Scanner(System.in);
void meth1()
{
	System.out.println("Hii which movies you want to watch?");
	String movies=sc.next();
	
	System.out.println("how many ticket you need for movies" + movies);
	String names[] = new String [sc.nextInt()];
	
	System.out.println("Enter "  + names.length +" names name for ticket booking");
	
	for(int i=0; i < names.length; i++)
	{
		names[i]=sc.next();
	}
	
	System.out.println(names.length + " Ticket has been book for " + Arrays.toString(names));
	
	System.out.println("Enter which row you need?");
	String row= sc.next();
	
	System.out.println("Below are your tickets");
	int count = 1;
	
	for(String data:names)
	{
		System.out.println(data + " " + row + " " + count++);
	}
}
public static void main(String[] args) 
{
	new ClassF().meth1();
	
}
			
}

package Training;
import java.util.Scanner;

public class Emp 
{
	 Scanner Sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("Details Entered by the user");
		
		System.out.print("\nEnter EmpName : ");
		String x=Sc.nextLine();
		
		System.out.print("\nEnter EmpId : ");
		int y=Sc.nextInt();
		
		System.out.print("\nEnter EmpSal : ");
		int z=Sc.nextInt();
		
		System.out.print("\nEnter EmpAddress : ");
		String a=Sc.next();
	}
	
	public static void main(String[] args)
	{
		new Emp().meth1();
	}
}

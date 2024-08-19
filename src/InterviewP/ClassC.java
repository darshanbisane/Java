package InterviewP;

import java.util.Scanner;

public class ClassC 
{
 void meth1()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter n value");
	 int n = sc.nextInt();
	 int count = 1;
	 for(int i =1;i<=n;i++)
	 {
		 for( n=1;n<=n;n++)
		 {
			 if(count < 10)
				System.out.println("0");
		 }
		 System.out.println(count + " ");
		 count++;
	 }
	 System.out.println();
 }
 public static void main(String[] args) {
	new ClassC().meth1();
}
}

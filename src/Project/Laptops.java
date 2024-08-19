package Project;
import java.util.Scanner;
public class Laptops
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println(" ◤–—————————————————————————————————————–———————————◥\r\n"
				+ " ¦◀▶▰▱▰▱▰▱▰▱ ▀▄▀▄  Welcome to Laptops shop  ▄▀▄▀ ▰▱▰▱▰▱▰▱◀▶¦\r\n"
				+ " ◣––—————————————–———————————————————————–———————————◢");
	
	System.out.println("Dear customers we are providing below services");
	
	System.out.println("\nFor knowing the services kindly press [yes]");
	String x=sc.nextLine();
	System.out.println("\n===========SERVICES===========");
	System.out.println();
	String arr[]= {"01.Softwares","02.Antiviruses","03.SSD","04.Reparing","05.Buy New Laptopes","06.Replacement old laptop"};
	
	for(String y : arr)
	{
		System.out.println(y + " ");
	}
	System.out.println();
	System.out.println("Please Select Code for Further Details:");
	int a=sc.nextInt();
	System.out.println();
	System.out.println("***Sofwtares***");
	
	String Software[]= {"\n77.Window ","78.Buisness Software","79.Gamimg Software ","80.Designed software","81.Coding Software"};
	for(String z : Software)
	{
		System.out.println(z + " ");
	}
	
	
	}
	public static void main(String[] args) {
		new Laptops().meth1();
	}
}


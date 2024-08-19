package String;

import java.util.Arrays;
import java.util.Scanner;

public class ClassA 
{
void meth1()
{
	System.out.println("meth1() called");
	String s1="Java";
	String s2 = new String ("Java");
	String s3 = "Java";
	String s4 = new String ("Java");
	
	System.out.println("\n" + s1.equals(s2)); // t
	System.out.println(s1.equals(s3)); //t
	System.out.println(s2.equals(s3)); //t
	
	System.out.println("\n"+ s2.equals("java")); //f
	System.out.println(s2.equalsIgnoreCase("Java"));//t
	
	System.out.println("\n" + "Java".equals("java")); // f
	System.out.println(s3.equals(new String ("java")));//f
	System.out.println(new String("Java").equals("Java"));//t
	System.out.println(s2.equals(s4));//t
	
	System.out.println("===============================");
	
	System.out.println(s1 == s2);
	System.out.println(s1 == s3);
	System.out.println(s2 == s4);
	System.out.println("java" == new String ("java"));
	System.out.println(new String ("java") == new String ("java"));
	System.out.println("java" == "java");
	
}
 void meth2()
 {
	 System.out.println("\nImplementing String class method");
	 String S1 = "Java";
	 System.out.println("s1 : " + S1); //Java
	 System.out.println("length() : " + S1.length()); //4
	 System.out.println("concat() : " +S1.concat(" is awesome")); // java is awesome
	 System.out.println("s1 : " + S1);
	 
	 System.out.println("charat() : " + S1.charAt(0) );
	 System.out.println("charat() : " + S1.charAt(S1.length()-2));
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("\nEnter your gender (M/F)");
	char gender= sc.next().charAt(0);
	 
	 switch(gender)
	 {
		 case 'F', 'f':
			 System.out.println("User is femail");
		 break;
		 
		 case 'M' ,'m':
			 System.out.println("User is mail");
		 break;
		 default:
		 System.out.println("Invalied data");
	 }
	 sc.close();
	 
	 String S2 = "Hello Darshan Bisane";
	 System.out.println("startswith() : " + S1.startsWith("Da"));
	 System.out.println(S2.startsWith(S1));
	 System.out.println(S2.startsWith("Java"));
	 System.out.println("touppercase : " + S1.toUpperCase());
	 System.out.println("lowercase : " + S1.toLowerCase());
	 System.out.println("S2 : " + S2);
	 
	 System.out.println("==============tostring()===============");
	 
	 System.out.println("substring (); " + S2.substring(5));
	 System.out.println(S2.substring(7));
	 System.out.println(S2.substring(9,11));//s a
	 System.out.println(S2.substring(3,9)); // l s
	 
	 String S3= " Hello India ";
	 System.out.println("replace() : " + S3.replace('H','h'));
	 System.out.println(S3.length());
	 System.out.println(S3.trim().length());
	 
	 System.out.println("indexof() : " + S3.indexOf('e'));
	 System.out.println("lastIndexof ()" + S3.lastIndexOf('w'));
	 
	 String data = "2-May-2024";
	 String arr[] = data.split("-");
	 System.out.println(Arrays.toString(S3.split(" ")));
	 System.out.println(Arrays.toString(S3.split(" ")));
	 
	 String S4= "ABCDEF";
	 byte arr2[] = S4.getBytes();
	 
	 for(byte b : arr2)
	 {
		 System.out.print((char)b);
	 }
	 
 }

public static void main(String[] args) 
 {
	new ClassA().meth1();
	new ClassA().meth2();
}
}

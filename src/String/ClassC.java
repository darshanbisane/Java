package String;

public class ClassC 
{
 public String makeAbba(String a , String b)
 {
	 return (a+b+a+b);
 }
 public static void main(String[] args)
 {
	System.out.println(new ClassC().makeAbba("what", "up"));
}
}

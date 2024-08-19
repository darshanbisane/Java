package Training;

public class ClassA 
{
 void mass() 
 {
	System.out.println("java is awesome"); 
	
 }
 void greet()
 {
	 System.out.println("Good morning..!");
 }
 public static void main(String[] args)
 {
	System.out.println("START");
	ClassA aobj=new ClassA();
	aobj.mass();          // 1st way for calling a method
	aobj.greet();
	System.out.println("============================");
	new ClassA().mass();  // 2nd way for calling a method
	new ClassA().greet();
	System.out.println("END");
	
}
}



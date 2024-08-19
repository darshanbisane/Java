package Training;

public class ClassG 
{
 int[] meth1()
 {
	 char[] arr1 = {'a','b','c','d','e'};
	 System.out.println("Forword direction");

	 for(char index = 0; index <= 4; index ++)
	 {
		 System.out.println( arr1 [index]+ " ");
	 }
	 
	 System.out.println("\nReverse direction\n");
	 
	 String [] arr2 = {"Darshan","jay","om","ansh","akshay","Priyanshu"};
	 
	 for(int index = 5;index >= 0 ;index--)
	 {
		 System.out.println(arr2 [index] + " ");
	 }
	 System.out.println();
	 boolean []arr3= {true};
	 for(boolean k: arr3)
	 {
		 System.out.println( k + " ");
	 }
	 return null;
 }
 public static void main(String[] args) 
 {
	new ClassG().meth1();
}
}

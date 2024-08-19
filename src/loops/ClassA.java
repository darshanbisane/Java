package loops;

public class ClassA 
{
 void meth1()
 {
	 System.out.println("meth1 called");
	 String name []= {"Darshan","jay","krushana","om","ansh"};
	 System.out.println("\n" + name [0]);
	 System.out.println(name [1]);
	 System.out.println(name [2]);
	 System.out.println(name [3]);
	 System.out.println(name [4]);  // way 1 but not recommended
	 
	 System.out.println("\nusing for loop we will retrive data from array");
	 System.out.println();
	 for(int index =0 ;index <=4; index++)  // way 2
	 {
		 System.out.println(name[index]+ " ");
	 }
	 System.out.println();
	 for(int index =4;index >=0;index--)
	 {
		 System.out.println(name[index]+ " "); 
	 }
	 
	 System.out.println("\nretrive using frr each loop");
	 
	 /* using for looking we can print reverse string also but using for each loop
	  * we can print only in forward direction.
	  */
	 
	 for(String d :name)  //way 3 but not print output in reverse direction
	 {
		 System.out.println(d + " ");
	 }
	 System.out.println();
	 
	 int arr []= {11,22,33,44,55,66};
	 for (int j:arr)
	 {
		System.out.println(j + " "); 
	 }
 }
 public static void main(String[] args) 
 {
	 new ClassA().meth1();
}
 
}

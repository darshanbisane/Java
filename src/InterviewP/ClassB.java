package InterviewP;

import java.util.Arrays;

public class ClassB 
{
 void meth1()
 { 
	 System.out.println("meth1() called");
	 int arr[]= {2,5,7,1,3,4,6,9,8};
	 
	 System.out.println(Arrays.toString(arr));
	 //Arrays.sort(arr);
	 
	 Arrays.parallelSort(arr , 0,5);
	 Arrays.parallelSort(arr, 5,9);
	 
	 System.out.println(Arrays.toString(arr));
 }
 public static void main(String[] args) 
 {
	new ClassB().meth1();
}
}

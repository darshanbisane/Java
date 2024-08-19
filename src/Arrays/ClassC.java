package Arrays;

public class ClassC 
{
	public boolean firstLast6(int[] nums)
	{
	  if (nums[0]==6 || nums[nums.length-1]==6)
		  return true;
	  return false;
	}
	public static void main(String[] args)
	{
		ClassC obj=new ClassC();
		int input[]= {3,1,5,7};
		//boolean result =obj.firstLast6(input);
		//System.out.println(result);
		obj.firstLast6(input);
		System.out.println(obj.firstLast6(input));
		
		
	}
}
/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) ? true
firstLast6([6, 1, 2, 3]) ? true
firstLast6([13, 6, 1, 2, 3]) ? false

public boolean firstLast6(int[] nums)
{
  //write your logic here
}*/
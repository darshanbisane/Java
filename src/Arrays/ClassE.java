package Arrays;

public class ClassE 
{
	public int sum3(int[] nums)
	{
	    return nums[0]+nums[1]+nums[2];

	}
	public static void main(String[] args)
	{
		ClassE a = new ClassE();
		int input[]= {1, 2, 3};
		//a.sum3(input);
		System.out.println(a.sum3(input));
}}

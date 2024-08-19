package Arrays;

import java.util.Arrays;

public class ClassD 
{
public int [] makepi()
{
	return new int[]  {3,1,4};
}
public static void main(String[] args)
{
           ClassD aobj=new ClassD();
            int []result = aobj.makepi();
         //  System.out.println(aobj.makepi());
            		
            		System.out.println(Arrays.toString(result));
;}
}

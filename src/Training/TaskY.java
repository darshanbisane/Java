package Training;

public class TaskY 
{
	void meth1()
	{
		System.out.println("hascode() : " + hashCode() );
		System.out.println("equals() : " + equals(null));
		System.out.println("getClass() : " + getClass());
		System.out.println("toString() : " + toString());
		//System.out.println("finalize() : " + finalize());
	}
	
	public static void main(String[] args)
	{
		TaskY aobj=new TaskY();
		aobj.meth1();
	}

}

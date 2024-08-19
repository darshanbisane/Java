package Training;

public class Programming 
{
	public Programming()
	{
		System.out.println("I Love Programming language"  );
		Programming aobj = new Programming("java");
	}
	public Programming(String A)
	{
		System.out.println("I Love " + A);
	}
	 public static void main(String[] args)
	 {
		 Programming aobj=new Programming();
		 
		// Programming aobj = new Programming("java");

	 }
}

/* 1) Create a class named 'Programming'. While creating an object of the class,
 *  if nothing is passed to it, then the message "I love programming languages" 
 *  should be printed. If some String is passed to it, then in place of 
 *  "programming languages" the name of that String variable should be printed.
 *  For example, while creating object if we pass "Java", then "I love Java"
 *   should be printed */

package String;

public class ClassD 
{
	public String extraend(String str)
	{
		String d = str.substring(str.length()-3) ;
		return d+d+d;
	}
	public static void main(String[] args)
	{
		System.out.println(new ClassD().extraend("Hello"));
	}
}

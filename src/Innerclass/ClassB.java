package Innerclass;
// method local inner class
public class ClassB 
{
void meth1()
{
	String s = "java";
	
	class innerclassA
	{
		void msg1()
		{
			System.out.println(s.concat(" is awesome"));
		}
	}
	new innerclassA().msg1();
	
	class innerclassB
	{
		void msg2()
		{
			System.out.println(s.concat(" i love it"));
		}
	}
	new innerclassB().msg2();
}
public static void main(String[] args) {
	new ClassB().meth1();
}
}

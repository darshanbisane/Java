package CollectionFW;


import java.util.ArrayList;
import java.util.Iterator;

public class ClassA 
{
 void meth1()
 {
	 System.out.println("Passing userdefine class object to array");
	 
	ArrayList<Student> al=new ArrayList<Student>();
	
	Student stud1 =new Student("Darshan", 100, "java");
	Student stud2 =new Student("Vijay", 200, "python");
	Student stud3 =new Student("Ajay", 300, "AWS");
	
	al.add(stud1);
	al.add(stud2);
	al.add(stud3);
	al.add(new Student("jay", 400, "Cloud Computing"));
	
	System.out.println("\nRetrive data by using iteration");
	Iterator<Student> i= al.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
 }
 public static void main(String[] args) 
 {
	new ClassA().meth1();
}
 
}

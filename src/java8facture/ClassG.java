package java8facture;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ClassG 
{
 void meth1()
 {
	 System.out.println("implementing Stream API\n");
	 
	 ArrayList<String> al =new ArrayList<String>();
	 al.add("Pooja");
	 al.add("Rita");
	 al.add("gita");
	 al.add("babita");
	 al.add("sita");
	 
	 System.out.println(al + " ");
	 
	 /* Stream<String> s1=al.stream();
	  
	  Stream<String> s2 =s1.filter(data -> data.length()<=5);
	  
	  long num = s2.count();
	  
	  System.out.println("There are " + num + " elements whose length <=5");*/
	 
	 //long num = al.stream().filter(data -> data.length()<=5).count(); // 2nd way
	 
	 System.out.println("There are "   //3rd way
	 + al.stream().filter(data -> data.length()<=5).count() +
	 " elements whose length <=5");
	 
	 
	 
 }
 public static void main(String[] args) 
 {
	new ClassG().meth1();
}
}

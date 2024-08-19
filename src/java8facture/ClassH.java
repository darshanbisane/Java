package java8facture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClassH
{
	void meth1()
	 {
		 System.out.println("implementing Stream API\n");
		 
		 ArrayList<Integer> al =new ArrayList<Integer>();
		 al.add(1);
		 al.add(5);
		 al.add(4);
		 al.add(3);
		 al.add(2);
		 
		 System.out.println("Before :" + al);
		 //Collections.sort(al); //sort using Collection
		 
		List<Integer> li=al.stream().sorted().collect(Collectors.toList());// sort using Stream API
		 
		 System.out.println("After : " + li);
		 
}
	public static void main(String[] args)
	{
		new ClassH().meth1();
	}
}

package java8facture;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassF 
{
 void meth1()
 {
	 System.out.println("implementing stream API\n");
	 
  ArrayList<Integer>al=new ArrayList<Integer>();
  al.add(10);
  al.add(20);
  al.add(30);
  al.add(40);
  al.add(50);
  
  System.out.println(al +" ");
  
  Iterator<Integer> a=al.iterator();
  
  while(a.hasNext())
  {
	  System.out.println(a.next()+" ");
  }
  
  System.out.println("\nReteriving by using foreach()");
  
  al.forEach(data -> System.out.println(data));
 }
 public static void main(String[] args) 
 {
	new ClassF().meth1();
}
}

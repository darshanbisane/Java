package CollectionFW;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;



public class ClassC
{
  void meth1()
  {
	  System.out.println("Implementing linklist");
	  LinkedList<Object> ll=new LinkedList<Object>();
	  ll.add(10);  //insertion order maintained
	  ll.add("java");//Heterogeneous data are allowed
	  ll.add(10); // Duplicate are allowed
	  ll.add(null);// null is allowed
	  ll.add('A'); // its available from java 1.2v
	  ll.add(55); //its default capacity is 0
	  ll.add(true);// its size increase by double
	  ll.add(20);//it is non-synchronized
	  
	  System.out.println("ll : "+ ll);
	  
	  System.out.println("\nReterived the data bu using for loop");
	  for(int i=0;i<ll.size();i++)
	  {
		  System.out.print(ll.get(i)+ " ");
	  }
	  System.out.println("\nReterived the data by using reverse order");
	  for(int i=ll.size()-1;i>=0;i--)
	  {
		  System.out.print(ll.get(i)+ " ");
	  }
	  System.out.println("\n\nReterived the data bu using Iterator");
	
	  Iterator<Object> i=ll.iterator();
	  while(i.hasNext())
	  {
		  System.out.print(i.next()+ " ");
	  }
	  
	  System.out.println("\n\nReterived the data bu using Enumeration interface");
	  Enumeration<Object> e=new Vector <Object>(ll).elements();
	  while(e.hasMoreElements())
	  {
		  System.out.print(e.nextElement()+ " ");
	  }
	  
	  
	  
	  System.out.println("\n\nReterived the data bu using for -each loop");
	  for(Object o:ll)
	  {
		  System.out.print(o + " ");
	  }
	 
  }
  public static void main(String[] args)
  {
	new ClassC().meth1();
}
}

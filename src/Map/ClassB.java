package Map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class ClassB
{
 void meth1()
 {
	 System.out.println("Implementing treemap");
	 
	 TreeMap<Object, Object> tm=new TreeMap<Object, Object>();
	 tm.put(101, "java");
	 tm.put(102, 1000);
	// tm.put(null, null);
	 tm.put(107, "java");
	 tm.put(103, 2000);
	 tm.put(106, "AWS");
	 tm.put(104, "Spring");
	 tm.put(105, "html");
	 
	 System.out.println(tm);
	 
	 System.out.println("\nkeyvalue : " + tm.get(107));
	 
	 System.out.println("\nreterive the data in ascending order");
	 
	 TreeSet<Object> ts=new TreeSet<Object>(tm.keySet());
	 System.out.println("Ascending order : " + ts);
	 
	 System.out.println("\nreterive the data in ascending order");
	 Iterator<Object>i=ts.descendingIterator();
	 
	 while(i.hasNext())
	 {
		 System.out.print(i.next() +" ");
	 }
	 
System.out.println("\nreteriving kay value pairs");
Vector<Object> v=new Vector<Object>(tm.entrySet());
Enumeration<Object> e=v.elements();

	while(e.hasMoreElements())
	{
		Entry eobj=(Entry)e.nextElement();
		System.out.println(eobj.getKey()+ " "+ eobj.getValue());
	}
	
}
 void meth2()
	{
	System.out.println("implementing hastable");	
	
	Hashtable<Object, Object> ht=new Hashtable<Object, Object>();
	
	ht.put(101, "java");
	 ht.put(102, 1000);
	// tm.put(null, null);
	 ht.put(107, "java");
	 ht.put(103, 2000);
	 ht.put(106, "AWS");
	 ht.put(104, "Spring");
	 ht.put(105, "html");
	 
	 System.out.println(ht);
	 
	 System.out.println("\nReteriving the value from hashtable");
	 ArrayList<Object> al=new ArrayList<Object>(ht.keySet());
	 
	 for(Object O:al)
	 {
		 System.out.println(ht.get(O));
	 }
	 
	}
	 

 public static void main(String[] args)
 {
	new ClassB().meth1();
	System.out.println("=============");
	new ClassB().meth2();
}
}

package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TaskA 
{
	 void meth1()
	 {
	LinkedHashMap<Object, Object>al1=new LinkedHashMap<Object, Object>();
	
	al1.put(101, "A");
	al1.put(103, "C");
	al1.put(104, "D");
	al1.put(105, "E");
	al1.put(102, "B");
	
	//System.out.println(al1);
	
	//ArrayList<Object> al2=new ArrayList<Object>(al1.values());
	
	TreeSet<Object> t=new TreeSet<Object>(al1.keySet());
	
	for(Object o:t)
	{ 
		System.out.print(al1.get(o)+ " ");
	}
	
	System.out.println();
	
	  Iterator<Object> i= t.descendingIterator();
	  while(i.hasNext())
	  {
		  System.out.print(al1.get(i.next() )+ " ");
	  }
	 }
	 public static void main(String[] args)
	 {
		new TaskA().meth1();
	}
	 
}

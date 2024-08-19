package Map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ClassA 
{
 void meth1()
 {
	 System.out.println("Implementing map interface");
	 HashMap<Object, Object> hm=new HashMap<Object, Object>();
	 
	 hm.put(101, "java"); // insertion order is 
	 hm.put("Darshan", "java");// Heterogeneous keys and values are
	 hm.put(null, null); // null are
	 hm.put(104, "Spring"); // duplicate data is
	 hm.put("java", 1000); //
	 hm.put(true , "AWS"); // default capacity is 16
	 hm.put(103, "Oracle"); // size increased by double
	 hm.put(102, "css"); // it is non-synchronized
	 
	 System.out.println("\n"+hm);
	 
	 System.out.println("\nget():" + hm.get(104));
	 
	 ArrayList<Object> al1=new ArrayList<Object>(hm.keySet());
	 
	 System.out.println("\nkeys : " + al1);
	 
	 System.out.println("\nReteriving the values");
	 for(Object o: al1)
	 {
		 //System.out.print(o);
		 System.out.println(hm.get(o));
	 }
	 
	 System.out.println("\nReteriving all the keys and values");
	 ArrayList<Object> al2=new ArrayList<Object>(hm.entrySet());
	 
	 Iterator<Object> i =al2.iterator();
	 while(i.hasNext())
	 {
		// System.out.println(i.next());
		 
		 Entry e=(Entry)i.next();
		 System.out.println(e.getKey() + "   " + e.getValue());
	 }
	 
 }
 public static void main(String[] args)
 {
	new ClassA().meth1();
}
}

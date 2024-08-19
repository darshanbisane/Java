package CollectionFW;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ClassF
{
 void meth1()
 {
	 System.out.println("implemention prioroty queues");
	 PriorityQueue<Object> pq=new PriorityQueue<Object>();
	 
	 pq.add(10); // insertion order is not maintained but start from small number
	 pq.add(9); // Heterogeneous data are not allowed
	// pq.add(null); // null is not allowed
	 pq.add(6); // available from java 0.1 v
	 pq.add(10); // duplicate value are allowed
	 pq.add(8); // default capacity is 11
	 pq.add(5); //not synchronized
	 
	 System.out.println(pq);
	 System.out.println("\nRetrive using iterator");
	Iterator<Object> i=pq.iterator();
	while(i.hasNext())
	{
		System.out.print(i.next()+" ");
	}
	
	System.out.println("\n\npeek() : " + pq.peek());
	System.out.println(pq);
	
	System.out.println("\npoll() : " + pq.poll());
	System.out.println(pq);
	
	System.out.println("\nremove() : " + pq.remove());
	System.out.println(pq);
	
	pq.clear();
	System.out.println("\npoll() : " + pq.poll());
	
//	System.out.println("\nremove() : " + pq.remove());
	
 }
 public static void main(String[] args)
 {
	new ClassF().meth1();
}
}

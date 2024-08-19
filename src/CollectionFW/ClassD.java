package CollectionFW;

import java.util.LinkedList;
import java.util.List;

public class ClassD
{
	void main()
	 {
		 List<Object> obj1=new LinkedList<Object>();
		 obj1.add(10);
		// obj1.offer(20);
		 
		 LinkedList<Object> obj2=new LinkedList<Object>();
		 obj2.offer(20);
		 obj2.add(50);
}
}

package CollectionFW;

import java.util.ArrayList;
import java.util.TreeMap;

//import javax.swing.Spring;

public class task2 
{
 TreeMap<String, Integer> meth1()
 {
	 TreeMap<String, Integer> tm =new TreeMap<String, Integer>();
	 
	 tm.put("Darshan", 1234);
	 tm.put("Akshay", 1235);
	 tm.put("Archina", 1236);
	 tm.put("Rohit", 1237);
	 
	 return tm;
 }
 
 public static void main(String[] args)
 {
TreeMap<String, Integer>map=new task2().meth1();

ArrayList<String> al=new ArrayList<String>(map.keySet());
 int i = 0;
for(String s:al)
{
	if(s.length() >= 4)
	{
		System.out.println("The string having length <= 4 are " );
	}
	System.out.println("The string having length <= 4 are " + i);
}
}
}

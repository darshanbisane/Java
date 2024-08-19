package CollectionFW;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ClassB
{
	//private Enumeration<Object> Enumaration <Student> e2;
	void meth()
	{
		System.out.println("Impleting vector");
		Vector<Object> v=new Vector<Object>();
		v.add(10); // Insertion order is
		v.add("java"); // Heterogeneous data is
		v.add(null); // null is
		v.add(10);  // Duplicate data is 
		v.add('A'); //legacy class from java 1 v
		v.add(true); // its default capacity is
		v.add(33);
		v.add(22);
		
		System.out.println("\n"+v);
		System.out.println("\nCapicaty :" + v.capacity());
		System.out.println("Size : " + v.size());
		
		
		v.add(1,"Spring");
		v.add(v.size(), 1000);
		v.add(500);
		System.out.println("\n"+v);
		System.out.println("\nCapicaty :" + v.capacity());
		System.out.println("Size : " + v.size());
		System.out.println("get() :" + v.get(0));
		
		System.out.println("\nReteriving the data by using for loop");
		for(int i = 0;i<v.size();i++)
		{
			System.out.print(v.get(i)+ " ");
		}
		System.out.println();
		System.out.println("\nIn reverse order");
		for(int i= v.size()-1; i>=0;i--)
		{
			System.out.print(v.get(i)+" ");
		}
		//System.out.println();
		System.out.println("\n\nReteriving the data by using for-each- loop");
		for(Object O :v)
		{
			System.out.print(O+ " ");
		}
		//System.out.println();
		System.out.println("\n\nReteriving the data by using Itrative interface");
		Iterator <Object>i= v.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+ " ");
		}
		System.out.println("\n\nReteriving the data by using Enumaration interface");
		Enumeration<Object> g = v.elements();
		while(g.hasMoreElements())
		{
			System.out.print(g.nextElement()+ " ");
		}
		
		System.out.println("\n\npassing the value by using arraylist");
		ArrayList<Object>al1=new ArrayList<Object>();
		for(Object t:v)
		al1.add(t);
		System.out.println("al1 : "+ al1);
		System.out.println("======or========");
		ArrayList<Object>al2=new ArrayList<Object>(v);
		System.out.println("al2 : "+ al2);
		
		System.out.println("\n\npassing user define class object into vector");
		Vector<Object> v2=new Vector<Object>();
		v2.add(new Student("darshan",10000,"Testing"));
		v2.add(new Student("Sourav",20000,"AWS"));
		v2.add(new Student("Ashish",10000,"Devops"));
		
	     Enumeration<Object> e2= v2.elements();
		
		while(e2.hasMoreElements())
		{
			System.out.println(e2.nextElement());
		}
	}
	public static void main(String[] args) 
	{
		new ClassB().meth();
	}
	
}

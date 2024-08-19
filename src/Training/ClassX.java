package Training;

public class ClassX 
{
 public static void main(String[] args) 
 {
	ClassX aobj1=new ClassX();
	ClassX aobj2=new ClassX();
	
	System.out.println("hascode of aobj1" + aobj1.hashCode());
	System.out.println("hascode of aobj2" + aobj2.hashCode());
	System.out.println("hascode() :" + new ClassX().hashCode());
	
	System.out.println("\n=============equals()=================");
	
	System.out.println("equals of aobj1 " + aobj1.equals(aobj2) );
	System.out.println(aobj2.equals(aobj2));
	System.out.println(new ClassX().equals(aobj2));
	System.out.println(new ClassX().equals(new ClassX()));
	
	System.out.println("\n===============getclass()====================");
	
	System.out.println(aobj1.getClass());
	System.out.println(aobj2.getClass());
	System.out.println("getclassx() :" + new ClassX().getClass());
	
	System.out.println("\n===============tostring()====================");
	
	System.out.println("aobj1" + aobj1.toString());
	System.out.println("aboj2" + aobj2.toString());
	
}
  
 
}

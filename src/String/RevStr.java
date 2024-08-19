package String;

public class RevStr
{
 void meth1(String name)
 {
	 String revrse = " ";
	 for(int i = name.length()-1;i >= 0; i--) // i= 2 , i =1, i =0
	 {
		 revrse = revrse + name.charAt(i); //y+ a+  j = yaj
	 }
	 System.out.println("name : " + name);
	 System.out.println("revrse : " + revrse);
	 if(name.equalsIgnoreCase(revrse))
	 {
		 System.out.println(name + " your name is pallendrom");
	 }
	 else
	 {
		 System.out.println(name + " your name is not pallendrom");
	 }
 }
 public static void main(String[] args) 
 {
	new RevStr().meth1("darshan");//2
}
	 
}

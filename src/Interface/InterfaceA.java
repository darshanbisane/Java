package Interface;

public interface InterfaceA 
{
  void meth1();
  int x= 100;  // by default its public static final
 default void meth2()   // java 1.8 v
 {
	 System.out.println("I am a defalt method");
 }
 
 static void meth3()   // java 1.8 v
 {
	 System.out.println("I am a static method");
 }
 private void meth4() // java 1.9 v
 {
	 System.out.println(" I am a private meth possiable onword java 1.9 v");
 }
  /*InterfaceA()
 {
	 System.out.println(" I AM A CONSTRAUCTOR");
 }*/
	 public static void main(String[] args) 
	 {
		System.out.println("I am main method");  // java 1.8 v
		System.out.println("X value : " + InterfaceA.x );
		InterfaceA .meth3();
	}
 
}

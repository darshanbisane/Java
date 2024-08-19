package oop;

public class ClassD extends Classc
{
void display()
{
	System.out.println("hi");
	
}
static int show(int a)// a=50
{
	System.out.println(a+a);//100
	return a+ a++;
}
ClassD()
{
this(show(50));
for(int i=1; ;i++)
{
	super .meth4();
	break;
}
System.out.println("hi");
System.out.println(show(50));
}
ClassD(int a)
{
	System.out.println(" ===> " + (a++ + show(50)));
}
public static void main(String[] args) 
{
	new ClassD().display();
}
}


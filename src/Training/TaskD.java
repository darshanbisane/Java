package Training;

public class TaskD 
{
 int calculator(int x)
 {
	 System.out.println("Inside Calculator:" + x);
	 return x*3;
 }
 int compute (int a, int b)
 {
	 System.out.println("Inside compute:" +a+ ","+b);
	 return a+b;
 }
 int process(int m,int n)
 {
	 System.out.println("Inside process:" +m+ ","+n);
	 return m-n;
 } 
 int analyze(int p,int q, int r)
 {
	 System.out.println("Inside Analyze:"+p+ ","+q+ "," +r);
	 return p*q+r;
 }
 int evalute(int x)
 {
	 System.out.println("Inside evalute:" + x);
	 return x/2;
 }
 public static void main(String[] args)
 {
   TaskD aobj=new TaskD();
   int result = aobj.calculator((aobj.compute(10,aobj.process(8,4)))+
		   aobj.analyze(5, 3, aobj.evalute(6)));
   
   System.out.println("Final result:"+ result);
}
 }

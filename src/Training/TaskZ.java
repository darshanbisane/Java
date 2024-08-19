package Training;

public class TaskZ 
{
  void meth1(int a)
  {
	  System.out.println("My day to day rutin from 7.00am to 12.00am\n");
	  if ( a == 7.00)
	  {
		  System.out.println("I am weakup at 6.30am");
		  System.out.println("Good morning all");
		  
      }
	  System.out.println("first task comp\n");
  }
  void meth2(String b)
  {
	  if(!(b == "coretraining"))
	  {
		  System.out.println("attend batch of " + b);
		  
		  System.out.println("learning new topics of" +b);
	  }
	  
	  else
	  {
		  System.out.println("not able to attend core batch");
		  System.out.println("not learning anything");
	  }
	  System.out.println("second task comp\n");
  }
  
  int meth3(int c)
  {
	  if(c  >=  10)
	  {
		System.out.println("i am went to lord shankar temple"); 
		System.out.println("feeling awesome");
	  }
	  else 
	  {
		 System.out.println("i am not able to went in temple");
		 System.out.println("feeling not good");
	  }
	  System.out.println("Third task comp\n");
	  return 10;
  }
  
  int meth4(int d )
  {
  if (d <= 11)
  {
	  System.out.println("Study time");
	  System.out.println("Practic all the learning new topic");
  }
  else
  {
	System.out.println("not able to do study");
	System.out.println("now feeling very guilty");
  }
  System.out.println("fourth task comp\n");
  return 11;
  }
  public static void main(String[] args) 
  
  {
	TaskZ obj=new TaskZ();
	obj.meth1(7);
	obj.meth2("java");
	System.out.println(obj.meth3(10));
	obj.meth4(12);
}
}
  


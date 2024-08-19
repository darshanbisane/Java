package Training;

public class AddAmount
{
  int amount = 500;
  
  public AddAmount()
  {
	  System.out.println("Current account amount :" + amount);
	  
	  AddAmount obj=new AddAmount(1000);
  }
  public AddAmount( int B)
  {
	  System.out.println("Total account amount :" + B);
  }
  public static void main(String[] args)
  {
	  AddAmount obj=new AddAmount();
	  
}
}


/*
Suppose you have a Bank Account  with an initial amount of 500 and you have to add some more amount 
to it. Create a class 'AddAmount' with a data member named 'amount' 
with an initial value of 500. Now make two constructors of this
 class as follows:
1 - without any parameter - no amount will be added then just
 display your balance with out updating
2 - having a parameter which is the amount that will be added to
 the account & display the final amount.*/

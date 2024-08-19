package Training;
public class Student 
{
	 //String A ;
 public Student()
 {
	 System.out.println("Student name Unknown");
	 Student obj=new Student("raj");
 }
 public Student(String A)
 {
	 System.out.println("Student name " + A);
 }
 public static void main(String[] args)
 {
	 Student obj=new Student();
}
}

/*
Write a program to print the name of a student by creating a
Student class. If no name is passed while creating an object of 
Student class, then the name should be "Unknown", otherwise the name 
should be equal to the String value passed while creating object of 
Student class.*/

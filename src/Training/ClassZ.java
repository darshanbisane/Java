package Training;

public class ClassZ
{
 String empName;
 int empid;
 String empdept;
 
    static String empCompany ="TCS";
 
 ClassZ(String name, int empid , String Dept)
 {
	 empName = name;
	 this.empid =  empid;
	 empdept = Dept;
	 //empCompany1=company;
 }
 public static void main(String[] args)
 {
	ClassZ emp1 =new ClassZ("Darshan",  2224920,  "Development");
	ClassZ emp2 =new ClassZ("Ashish",  2224921,  "Development");
	ClassZ emp3 =new ClassZ("Tushar",  2224922,  "SAP");

System.out.println(emp1.empName +" "+ emp1.empid +" "+ emp1.empdept +" "+ emp1.empCompany);
System.out.println(emp2.empName +" "+ emp2.empid +" "+ emp2.empdept +" "+ emp2.empCompany);
System.out.println(emp3.empName +" "+ emp3.empid +" "+ emp3.empdept+" "+ emp3.empCompany);

emp1.empid = 50000;
emp1.empCompany = "Infosys";

System.out.println("\n"+emp1.empName +" "+ emp1.empid +" "+ emp1.empdept +" "+ emp1.empCompany );
System.out.println(emp2.empName +" "+ emp2.empid +" "+ emp2.empdept +" "+ emp2.empCompany);
System.out.println(emp3.empName +" "+ emp3.empid +" "+ emp3.empdept +" "+ emp3.empCompany);

}
}

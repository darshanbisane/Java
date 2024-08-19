package CollectionFW;

public class Student
{
 private String StudName;
 private int StudNo;
 private String Dept;
 

public Student(String studName, int studNo, String dept) {
	
	StudName = studName;
	StudNo = studNo;
	Dept = dept;
	
}
@Override
public String toString() {
	return StudName +" " + StudNo +" " + Dept + " ";
}

}

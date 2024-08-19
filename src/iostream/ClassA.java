package iostream;
 /*  Byte stream code */
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassA 
{
 void FileOpration1()throws Exception   // read
 {
	 System.out.println("i am going the read the file data");
	 FileInputStream fis= new FileInputStream("E:\\iostream\\file1.txt");
	 System.out.println("Connection created");
	 int i;
	 while((i= fis.read())!= -1)
	 {
		 System.out.print((char)i);
	 }
	 System.out.println("\nData reterived");
	 fis.close();
 }
 
 void FileOpration2()throws Exception
 {
	 System.out.println("i am going the write a  data in a file");
	 FileOutputStream fos=new FileOutputStream("E:\\iostream\\file2.txt", true);
	 System.out.println("Connection created");
	 String msg = ", Because i enjoyed it..! ";
	 byte arr[] = msg.getBytes();
	 fos.write(arr);
	 System.out.println("Data write");
	 fos.close();
 }
 
 void FileOpration3()throws Exception // copy
 {
	 System.out.println("i am going the to copy data from the file"); 
	 FileInputStream fis= new FileInputStream("E:\\iostream\\file2.txt");
	 FileOutputStream fos=new FileOutputStream("E:\\iostream\\file3.txt");
	  
	 System.out.println("Connection created");
	 
	 int i;
	 while((i=fis.read())!=-1)
	 {
		fos.write(i);
	 }
	 System.out.println("data copied");
	 fis.close();
	 fos.close();
 }
 public static void main(String[] args)throws Exception
 {
	ClassA aobj=new ClassA();
	//aobj.FileOpration1();
	//aobj.FileOpration2();
	aobj.FileOpration3();
}
}

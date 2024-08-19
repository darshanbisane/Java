package iostream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
public class ClassC
{
 void fileopration()throws Exception
 {
	 
	 System.out.println("reading the data from file using BuffercharactorStreams");
	 BufferedReader brs=new BufferedReader(new FileReader("E:\\iostream\\file1.txt"));
	 
	 System.out.println("\nConnection Creared");
	 
	 int i ;
	 while((i=brs.read())!=-1)
	 {
		 System.out.print((char) i);
	 }
	 System.out.println("\nData reterived");
	 brs.close();
	 
	 System.out.println("\nWriting the data from file using BuffercharactorStreams");
	 
	 BufferedWriter bws=new BufferedWriter(new FileWriter("E:\\iostream\\file1.txt",true));
	 
	 String msg = " I love java ";
	 bws.write(msg);
 System.out.println("data written");
 
 bws.close();
 
 
 System.out.println("\nCopying the data from file using BuffercharactorStreams");
 
 BufferedReader br=new BufferedReader(new FileReader("E:\\iostream\\file1.txt"));
 BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\iostream\\file4.txt"));
 
 System.out.println("Connection created");
 
 int j ;
 while((j=br.read())!=-1)
 {

   bw.write(j);
 }
 br.close();
 bw.close();
 }
 
 public static void main(String[] args) throws Exception
 {
	new ClassC().fileopration();
}
 
}

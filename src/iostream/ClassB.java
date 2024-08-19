package iostream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassB 
{
 void FileOperation() throws Exception
 {
	 System.out.println("reading the data from file using BufferByteStreams");
	 
	 BufferedInputStream bis =new BufferedInputStream(new FileInputStream("E:\\iostream\\file1.txt"));
	 System.out.println("Connection Created");
	 
	 int i;
	 
	 while((i=bis.read())!= -1) 
	 {
		 System.out.print((char)i);
	 }
	 bis.close();
 
	
	 System.out.println("========write data==========");
	 
	 System.out.println("Writing the data from file using BufferByteStreams");
	 
	 BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\iostream\\file1.txt",true));
	 
	 System.out.println("\n connection created");
	 
	 String msg = "IO-Stream are crazily easy";
	 bos.write(msg.getBytes());
	 
	 //bos.close();
	 bos.flush();
	 
			 
 }
 public static void main(String[] args) throws Exception
 {
	ClassB bobj=new ClassB();
	bobj.FileOperation();
}
 
}

import java.io.*;

public class FileBufferExample
{
public static void main(String[] args) throws IOException
{
	int i;
FileWriter fw = new FileWriter("./FileTesting.txt",true);
BufferedWriter bw = new BufferedWriter(fw);
 bw.write("I am just testing BufferedWriter.");
FileInputStream fis = new FileInputStream("./FileTesting.txt");
 do
 {
	 i=fis.read();
	 if(i!=-1)
	 {
	 System.out.print((char)i);
	 }
	 
 } while(i!=-1);
 fis.close();
 bw.close();
}
}
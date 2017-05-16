import java.io.IOException;
import java.io.File;
public class FileHandlingExample
{
public static void main(String[] args) throws IOException
{
File f=new File("D:/Programs/TestingFile.txt");
f.createNewFile();
System.out.println("Is Exists: "+f.exists());
System.out.println("Size: "+f.length());
System.out.println("permision: "+f.canWrite());
System.out.println("name of file: "+f.getName());
f.delete();
}
}
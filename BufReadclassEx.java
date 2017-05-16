import java.io.*;
public class BufReadclassEx
{
public static void main(String[] args) throws IOException
{
FileReader fr= new FileReader("./FileTesting.txt");
BufferedReader br= new BufferedReader(fr);
char[] ch= new char[20];
br.read(ch, 10,4);
System.out.println(ch);
fr.close(); 
}
}
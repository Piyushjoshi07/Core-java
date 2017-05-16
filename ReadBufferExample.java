import java.io.*;
public class ReadBufferExample
{
public static void main(String[] args) throws IOException
{ int i;
FileWriter f=new FileWriter("./FileTesting.txt",true);
BufferedWriter bf=new BufferedWriter(f);
bf.write("Hello");
FileReader fr= new FileReader("./FileTesting.txt");
BufferedReader br= new BufferedReader(fr);
while((i=br.read())!=-1)
{System.out.print((char)i);}
bf.close();
br.close();
}
}
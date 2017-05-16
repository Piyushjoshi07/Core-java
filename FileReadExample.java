import java.io.*;

public class FileReadExample
{
public static void main(String[] args) throws IOException
{
int i;
FileInputStream fis= new FileInputStream("./FileTesting.txt");
do
{
i=fis.read();
if(i!=-1)
System.out.print((char)i);
}
while(i!=-1);
fis.close();
}
}
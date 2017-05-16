import java.io.*;

public class OutputStreamExample
{
	
public static void main(String[] args) throws IOException
{
	FileOutputStream fout=new FileOutputStream("./FileTesting.txt",true);
	String s= "File Testing";
	char ch[] =s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		fout.write(ch[i]);
		
	}
	fout.close();
}
}

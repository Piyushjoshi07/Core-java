import java.io.*;
public class StringReadExample
{
public static void main(String[] args) throws IOException
{
String s,S1;
int i;
FileOutputStream f= new FileOutputStream("./FileTesting.txt",true);
S1="I am trying to do some innovations in programming";
char ch[]=S1.toCharArray();
for(i=0;i<S1.length();i++)
{
	
	f.write(ch[i]);
}
f.close();
FileReader fr= new FileReader("./FileTesting.txt");
BufferedReader br= new BufferedReader(fr);

while((s=br.readLine())!=null)
{System.out.println(s);}
fr.close(); 
}
}
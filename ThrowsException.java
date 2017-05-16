import java.io.*;
public class ThrowsException
{
public static void main(String[] args) //throws IOException(if we use throw then it compiles the program without any error but display the error during runtime)
{
	try
{
throw new IOException();
//System.out.println("You crossed the barrier");
}
catch(IOException e)
{
	System.out.println("Exception:"+e.getMessage());
}
}
}
public class StringCompare
{
public static void main(String[] args)
{
String s1="computer";
String s2="Computer";
if(s1.equalsIgnoreCase(s2))
{
System.out.println("Equal");
}
else
System.out.println("Unequal");

int i=s1.compareTo(s2);
if(i==0)
{
	System.out.println("equal");
	
}
else
{
	System.out.println("Unequal  "+i);
	
}

String s3=s1.substring(2,4);
System.out.println(s3);

}
}
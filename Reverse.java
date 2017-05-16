import java.util.*;
class Reverse
{
public static void main(String args[])
{
String or, re="";
Scanner sc= new Scanner(System.in);
or= sc.nextLine();
for (int i=or.length()-1;i>=0;i--)
{
re= re+or.charAt(i);
}
System.out.println(re);
}

}

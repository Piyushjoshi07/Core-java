import java.util.*;
class ScannerExample
{
public static void main(String[] args)
{
System.out.println("Please enter you name and age");
Scanner sc= new Scanner(System.in);
String name= sc.nextLine();
int age= sc.nextInt();
System.out.println("Name is:"+name +"\nAge is "+age);
}
}
	
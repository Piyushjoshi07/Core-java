public class StringExample
{
public static void main(String[] args)
{
String Str1= "Computer";
String Str2= "Computer";
String Str3= new String("Computer");
System.out.println("Result: "+(Str1==Str2));
System.out.println("Result: "+Str1.equals(Str2));
System.out.println("Result: "+(Str1==Str3));
System.out.println("Result: "+Str1.equals(Str3));

}
}
public class ExceptionExample
{
public static void main(String[] args)
{
try
{
System.out.println(2/0);
System.out.println("Try Block");

}
catch(NullPointerException e)

{
System.out.println("Exception" +e.getMessage());
}
catch(ArithmeticException e)
{
System.out.println("Exception"+e.getMessage());

}
finally
{
System.out.println("Hello");
}
}
}
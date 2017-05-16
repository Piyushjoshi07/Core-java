class Greeting
{
public void sayHello()
{
System.out.println("Hello India");
} 
}
class India
{
Greeting g=new Greeting()
{
public void sayHello()
{
System.out.println("Namaste India");
}
};
}
public class AnonynomousExample
{
public static void main(String[] args)
{
India i=new India();
i.g.sayHello();
}
}
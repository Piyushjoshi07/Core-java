class A
{ 
public static void f1()
{
System.out.println("You are in A");
}
}
class B
{
public static void f1()
{
System.out.println("You are in B");
}
}
public class StaticInheritance
{
public static void main(String[] args)
{
B obj=new B();
B.f1();
A.f1();
}
}
class A
{
public void show(int x)
{
System.out.println("Class A");
}
}
class B extends A
{
public void show(int x)
{
System.out.println("Class B");
}
}
public class Overidding
{
public static void main(String[] args)
{
B obj= new B();
obj.show(5);
}
}
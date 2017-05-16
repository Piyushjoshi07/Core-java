class Outer
{
static int x=10;
 class Inner
{
public void f1()
{

System.out.println("f1()"+x);

}
}
}
public class NestedClassExample
{
public static void main(String[] args)
{
Outer o1= new Outer();
Outer.Inner o2 = o1.new Inner();
o2.f1();
}
}
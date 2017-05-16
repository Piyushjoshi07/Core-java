abstract class A
{
abstract void show();
}
class B extends A
{
void show()
{

}
}
public class AbstractExample
{
public static void main(String[] args)
{
B obj= new B();
obj.show();
}
}
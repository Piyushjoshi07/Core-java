class A
{
public A()
{
System.out.println("Constructor A 1");
}
}
class B extends A
{ 

public B()
{
	this(4);
System.out.println("Constructor B 1");
}
public B(int x)
{
System.out.println("Constructor B 2");
}
}
class ConstructorChaining
{
public static void main(String[] args)
{
B obj= new B();
}
}
class A
{int x;
public A(int x)
{
	int a=x;
	System.out.println("Constructor of A");
	System.out.println(a);
}
}
class B extends A
{
int y;
public B()
{
	super(4);
System.out.println("Cosntructor of B");
}
}
class ConstructorInheritance
{
public static void main(String[] args)
{
B obj= new B();

}
} 
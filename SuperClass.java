class A
{
	int x;
void f1()
{
}
}
class B extends A
{int x;
void f1()
{ 
super.f1();
}

void f2()
{
int x;
x=2;
this.x=3;
super.x=4;
}
}
public class SuperClass
{
public static void main(String[] args)
{
B obj =new B();
obj.f1();
obj.f2();
System.out.println("Successfully executed the program");
}
}
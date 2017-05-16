class A extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread A"+i);
		}
	}	
	
}
class B extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.println("Thread B"+i);
		}
	}	
	
}
class ThreadExample2
{
public static void main(String[] args)
{
A a = new A();
B b = new B();
a.start();
b.start();

}
}
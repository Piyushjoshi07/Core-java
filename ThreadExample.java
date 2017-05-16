import java.lang.*;
class A implements Runnable 
{
int i;
public void run()
{
for (i=0;i<=10;i++)
{
System.out.println("Thread A"+i);
}
}
}
class B implements Runnable
{
int i;
public void run()
{
for (i=0;i<=10;i++)
{
System.out.println("Thread B"+i);
}
}
}
public class ThreadExample
{
public static void main(String[] args)
{
Thread t1= new Thread(new A());
Thread t2= new Thread(new B());
t1.start();
t2.start();
}
}
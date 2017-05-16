import java.util.*;
import java.lang.*;
class Account
{
private int bal;
public Account(int bal)
{this.bal=bal;}
public boolean isSufficient(int w)
{
if(bal>w)
return(true);
else
return(false);
}
public void withdrawal(int amount)
{
bal=bal-amount;
System.out.println("withdrawal Amount is:"+amount);
System.out.println("Currently your balance is "+bal);
}
}
class Customer implements Runnable
{
private String name;
private Account account;
public Customer(Account account, String name)
{
this.account=account;
this.name=name;
}
public void run()
{

synchronized(account)
{ 
System.out.println(name+"please enter the amount to withdraw");
Scanner sc= new Scanner(System.in);
int amount=sc.nextInt();
if(account.isSufficient(amount))
{
System.out.println(name);
account.withdrawal(amount);
}
else
{
System.out.println("Insufficient Balance");
}
}
}
}
public class ThreadSyncExample
{
public static void main(String[] args)
{
Account a1= new Account(1000);
Customer c1= new Customer(a1, "sujeeta");
Customer c2= new Customer(a1, "Shruti");
Thread t1= new Thread(c1);
Thread t2 = new Thread(c2);
t1.start();
t2.start();
}
}
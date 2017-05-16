import java.util.*;
public class ExceptionExample2
{
public static void main(String[] a)
{
int balance=5000;
System.out.println("Ennter the withdrawal amount");
Scanner sc=new Scanner(System.in);
int withdrawal= sc.nextInt();
try
{
if(withdrawal>balance)
throw new ArithmeticException("Insufficient Balance");
balance = balance-withdrawal;
System.out.println("New Balance= "+balance);
}
catch(ArithmeticException e)
{
System.out.println("Sorry an exception occured :"+e.getMessage());
}
System.out.println("Thank you Visiting \n Have a good Day");
}
}
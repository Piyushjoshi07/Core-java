import java.util.*;
public class ArrayExample
{
public static void main(String[] args)
{
int[] arr = new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the values in the array");
for(int i=0;i<5;i++)
{arr[i]=sc.nextInt();}
for(int i=0;i<5;i++)
{
	System.out.println("array"+"["+(i+1)+"]"+" = "+arr[i]);
}
}
}
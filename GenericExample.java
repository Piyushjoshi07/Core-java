public class GenericExample
{
public <E> void arraya(E[] s)
{
for(E x:s)
{
System.out.println(x);
}
}
public static void main(String[] args)
{
GenericExample e=new GenericExample();
String country[]= new String[]{"India","United States", "United Kingdom"};
Integer rank[]={1,2,3};
e.arraya(country);
e.arraya(rank);
}
}

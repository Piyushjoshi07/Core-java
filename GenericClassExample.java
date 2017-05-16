class Mydata<T> 
{
T i;
public void add(T i1)
{
i=i1;
}
public T get()
{return(i);}
}
public class GenericClassExample
{
public static void main(String[] args)
{
Mydata<Integer> e1= new Mydata<Integer>();
Mydata<String> e2 = new Mydata<String>();
e1.add(5);
e2.add("Generic Class Successful");
System.out.println("e1= "+e1.get()+"\ne2= "+e2.get());
}
}
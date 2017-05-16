package pack1;
import pack2.Student;
public class Example
{
public static void main(String[] args)
{
Student s= new Student();
s.setRollno(50434);
s.setName("Piyush");
System.out.println ("Roll number is "+s.getRollno());
System.out.println ("Name is "+s.getName());
}
}
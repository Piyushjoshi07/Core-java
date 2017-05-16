package Inheritance;
public class Head
{
public static void main(String[] args)
{
Employee e=new Employee();
e.setRollno(650434);
e.setName("Piyush");
e.setAge(24);
System.out.println("Roll number is:"+e.getRollno());
System.out.println("Name is:"+e.getName());
System.out.println("Age is:"+e.getAge());
}
}
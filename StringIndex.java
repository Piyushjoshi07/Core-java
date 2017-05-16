public class StringIndex
{
public static void main(String[] args)
{
String s1= "Computer";
System.out.println("My name is"+" Piyush");
int i = s1.indexOf('m');
int j = s1.indexOf('m',4);
int k = s1.indexOf("put",2);
int l = s1.lastIndexOf('m',5);
int m = s1.lastIndexOf("com",3);
System.out.println(i+" "+j+" "+k+" "+l+" "+m);
}

}
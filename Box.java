package constructor;
public class Box
{ private int l,b,h; 
public Box()
{
l=10;
b=15;
h=20;
}
public Box(int L, int B, int H)
{
l=L; b=B; h=H;
}
public void ShowDimensions()
{
System.out.println("L="+l);
System.out.println("B="+b);
System.out.println("H="+h);
}
public static void main(String[] args)
{
Box b1= new Box();
Box b2= new Box(5,10,15);
System.out.println("Hello");
System.out.println("Dimension of First box is");
b2.ShowDimensions();
System.out.println("Dimension of Second box is");
b1.ShowDimensions();
}
}
class TwoDarray
{
public static void main(String[] args)
{
int[][] a= new int[3][];
a[0]=new int[2];
a[1]= new int[4];
a[2]= new int [1];
a[0][1]=4;
a[1][2]=5;
System.out.println(a[0][1]);
System.out.println(a[1][2]);
}
}
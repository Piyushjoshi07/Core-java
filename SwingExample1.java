import javax.swing.*;
public class SwingExample1 extends JFrame
{public SwingExample1()
	{}
	public SwingExample1(String s)
	{
		
		super(s);
	}
public static void main(String[] args)
{
SwingExample1 o1= new SwingExample1("Swing Example1");
o1.setSize(300,300);
o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
o1.setVisible(true);
}
}
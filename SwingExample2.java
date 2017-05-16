import javax.swing.*;
import java.awt.event.*;	
public class SwingExample2 extends JFrame
{
JLabel l1,l2,l3,l4;
JTextField t1,t2;
JButton b1;
	public SwingExample2()
	{}
	public SwingExample2(String s)
	{
		
		super(s);
	}
public void setComponents()
{
 l1=new JLabel("Addition of two Number");
 l2=new JLabel("First Number");
 l3=new JLabel("Second Number");
 l4=new JLabel();
 t1=new JTextField();
 t2=new JTextField();
 b1=new JButton("Add");
 setLayout(null);
l1.setBounds(50,50,200,20);
l2.setBounds(30,80,100,20);
l3.setBounds(30,110,100,20);
t1.setBounds(150,80,100,20);
t2.setBounds(150,110,100,20);
b1.setBounds(100,140,70,20);
l4.setBounds(100,180,200,20);
b1.addActionListener(new Handler());
 
 add(l1);
 add(l2);
 add(l3);
 add(l4);
 add(t1);
 add(t2);
 add(b1);
}
class Handler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=a+b;
		l4.setText("Sum is: "+c);
		
	}
	
}
 
 
public static void main(String[] args)
{
	
	
SwingExample2 o1= new SwingExample2("Swing Example1");
o1.setComponents();
o1.setSize(300,300);
o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
o1.setVisible(true);
}
}
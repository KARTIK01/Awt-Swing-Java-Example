import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyF implements ActionListener
{
Button b;
Frame f;
	MyF()
	{
	f=new Frame();
	b=new Button();
	b.setBounds(20,50,50,50);
	b.addActionListener(this);
	
	f.add(b);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	Graphics g=f.getGraphics();
	g.drawLine(70,70,200,200);
	g.drawOval(70,70,200,200);
	}
	
	public static void main(String... s)
	{
	new MyF();
	}
	}
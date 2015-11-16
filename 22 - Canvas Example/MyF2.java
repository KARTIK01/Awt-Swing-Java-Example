import java.awt.*;
import java.awt.event.*;

class MyCanvas1 extends Canvas
{
	int f=0;
	public void paint(Graphics g)
	{
	if(f==1)
	{
	g.setColor(Color.RED);
	g.drawLine(10,10,10,200);
	g.setColor(Color.green);
	g.fill3DRect(20,20,200,200,true);
}}}

class MyF2 implements ActionListener
{
MyCanvas1 m=new MyCanvas1();
	MyF2()
	{
	Frame f=new Frame("graphics");
	Button b=new Button("line");
	f.add(m);
	f.add(b);
	b.addActionListener(this);
	f.setSize(400,400);
	f.setLayout(new GridLayout(2,1));
	f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	m.f=1;
	m.repaint();
	}
	
	public static void main(String... s)
	{
	new MyF2();
	}
	}
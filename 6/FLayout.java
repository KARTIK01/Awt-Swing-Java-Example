import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FLayout
{
JFrame f;
JButton b[];
	FLayout(String s)
	{
	f=new JFrame(s);
	b=new JButton[5];
	String s1[]={"north","south","east","west","center"};

	for(int i=0;i<b.length;i++)
	{
	b[i]=new JButton(s1[i]);
	f.add(b[i]);
	}
	f.setLayout(new FlowLayout());
	//f.setLayout(new FlowLayout(FlowLayout.LEFT)); .RIGHT .CENTER
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(400,400);
	f.setVisible(true);
	}
	
	public static void main(String... s)
	{
	new FLayout("FLayout");
	}
}
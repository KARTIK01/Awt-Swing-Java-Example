import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Sframe implements ActionListener
{
	JFrame f;
	JButton b;
	Button b1;
	JTextField tf;
	Icon i;
	Sframe(String s)
	{
	i=new ImageIcon("puccy.gif");
	f=new JFrame(s);
	tf=new JTextField();
	tf.setBounds(150,40,100,100);
	tf.setEditable(false);
	b=new JButton("swing");
	b1=new Button("awt");
	
	b.setBounds(40,40,100,100);
	b1.setBounds(40,150,100,100);
	
	Container c=f.getContentPane();
	c.add(tf);
	c.add(b);
	c.add(b1);
	b.addActionListener(this);
	b1.addActionListener(this);
	c.setLayout(null);
	//f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	//f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	//f.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	f.setSize(400,400);
	f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	tf.setText("SWING");
	}
	
	public static void main(String... s)
	{
	new Sframe("SWING FRAME");
	new Sframe("SWING FRAME");
	}
	}
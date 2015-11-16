import java.awt.*;
import java.awt.event.*;


class WindowEventListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

class MouseEventListener extends MouseAdapter
{
	EventDemo2 t;
	MouseEventListener(EventDemo2 q)
	{
		this.t=q;
	}
	public void mouseClicked(MouseEvent e)
	{
		t.tf.setText("MOUSE EVENT");
		t.f.setBackground(Color.RED);
	}
	
}

class KeyEventListener extends KeyAdapter
{
	public void keyTyped(KeyEvent e)
	{
		System.out.println(e.getKeyChar());
	}	
}

class EventDemo2
{ TextField tf;Frame f;
	EventDemo2()
	{
		f=new Frame("event trap");
		Button b=new Button("BUTTON 1");
		Button b1=new Button("BUTTON 2");
		b.setBounds(40,40,80,40);
		b1.setBounds(130,40,80,40);
		f.add(b);
		f.add(b1);
		tf=new TextField();
		tf.addKeyListener(new KeyEventListener());
		tf.setBounds(40,100,100,30);
		f.add(tf);
		f.addWindowListener(new WindowEventListener());
		f.addMouseListener(new MouseEventListener(this));
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main(String... s)
	{
	new EventDemo2();
	}
}
		

		
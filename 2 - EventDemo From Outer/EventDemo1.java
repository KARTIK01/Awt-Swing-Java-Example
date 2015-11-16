import java.awt.*;
import java.awt.event.*;
class EventDemo1
{
	Frame f;
	Button b,b1;
	TextField tf;
		EventDemo1(String s)
		{
			f=new Frame(s);
			b=new Button("LALU");
			b1=new Button("RABNI");
			b.setBounds(35,80,40,20);
			b1.setBounds(80,80,40,20);
			
			Outer o=new Outer(this);
			b.addActionListener(o);
			
			b1.addActionListener(o);
			
			f.add(b);
			f.add(b1);
			tf=new TextField();
			tf.setBounds(30,30,100,40);
			f.add(tf);
			
			f.setLayout(null);
			f.setSize(400,400);
			f.setVisible(true);
		}
		 
		 public static void main(String... s)
		 {
		 new EventDemo1("EVENT DEMO1");
		 }
}
		 
		
		
	
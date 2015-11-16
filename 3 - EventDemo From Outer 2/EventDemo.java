import java.awt.*;
import java.awt.event.*;
class EventDemo implements ActionListener
{
	Frame f;
	Button b,b1;
	TextField tf;
		EventDemo(String s)
		{
			f=new Frame(s);
			b=new Button("ok");
			b1=new Button("cancle");
			b.setBounds(35,80,40,20);
			b1.setBounds(80,80,40,20);
			
			
			
			b.addActionListener(this);
			b1.addActionListener(new Outer(this));
			
			f.add(b);
			f.add(b1);
			tf=new TextField();
			tf.setBounds(30,30,100,40);
			f.add(tf);
			
			f.setLayout(null);
			f.setSize(400,400);
			f.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e)
		{
		 if(e.getSource()==b)
		 tf.setText("OK");
		 }
		 
		 public static void main(String... s)
		 {
		 new EventDemo("EVENT DEMO");
		 }
}
		 
		
		
	
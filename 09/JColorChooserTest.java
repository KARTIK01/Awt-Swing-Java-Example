import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JColorChooserTest extends JFrame implements ActionListener
{
	public static void main(String... s)
	{
		new JColorChooserTest();
	}
	
	public JColorChooserTest()
	{
		super("using ColorChooser");
		WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());
		Container content=getContentPane();
		content.setBackground(Color.WHITE);
		content.setLayout(new FlowLayout());
		JButton ColorButton=new JButton("GET COLOR");
		ColorButton.addActionListener(this);
		
	    content.add(ColorButton);
		
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	//args are parent component,title,initial color
	
	Color bgcolor=JColorChooser.showDialog(this,"Choose Background Color",Color.RED);
	
	if(bgcolor!=null)
	getContentPane().setBackground(bgcolor);
	}
}
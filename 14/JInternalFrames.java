import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JInternalFrames extends JFrame
{
	public static void main(String... s)
	{
	new JInternalFrames();
	}
	public JInternalFrames()
	{
	super("multiple document interface");
	WindowUtilities.setNativeLookAndFeel();
	addWindowListener(new ExitListener());
	
	Container c=getContentPane();
	c.setBackground(Color.WHITE);
	JDesktopPane desktop=new JDesktopPane();
	desktop.setBackground(Color.GREEN);
	c.add(desktop,BorderLayout.CENTER);
	Color r[]={Color.RED,Color.YELLOW,Color.GREEN,Color.BLACK};
	for(int i=0;i<4;i++)
	{
	JInternalFrame frame=new JInternalFrame(("inerframe"+i),true,true,false,false);
	frame.setLocation(i*50+10,i*50+10);
	frame.setSize(200,150);
	frame.setBackground(r[i]);
	frame.setVisible(true);
	desktop.add(frame);
	frame.moveToBack();
	}
	setVisible(true);
	setSize(500,500);
	
}}
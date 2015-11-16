import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class FileChooser extends JFrame implements ActionListener
{
	JFileChooser jfc;
	public FileChooser()
	{
		super("FILE CHOOSE");
		jfc=new JFileChooser("e:\\java\\kartik123");
		JButton jb=new JButton("OK");
		jb.addActionListener(this);
		getContentPane().add(jb);
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	int x=jfc.showSaveDialog(null);
	//int x=jfc.showOpenDialog(null);
	if(x==JFileChooser.APPROVE_OPTION)
	{
	File f=jfc.getSelectedFile();
	System.out.println(f.getPath());
	System.out.println(jfc.getName(f));
	File f1=jfc.getCurrentDirectory();
	System.out.println(jfc.getName(f1));
	}
	if(x==JFileChooser.CANCEL_OPTION)
	{
	System.out.println("cancle");
	}
}
public static void main(String... s)
{
new FileChooser();
}
}
	
	
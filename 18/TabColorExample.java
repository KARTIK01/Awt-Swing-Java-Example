import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class TabColorExample extends JPanel
{

public TabColorExample()
{
	setLayout(new BorderLayout());
	
	UIManager.put("TABBED PANE.selected",Color.green);
	JTabbedPane tabbedPane=new JTabbedPane(JTabbedPane.TOP);
	
	String tab[]={"one","two","three","four"};
	Color[] colors={null,Color.RED,Color.BLUE,Color.black};
	
	for(int i=0;i<tab.length;i++)
	{
	tabbedPane.addTab(tab[i],createPane(tab[i]));
	tabbedPane.setBackgroundAt(i,colors[i]);
	}
	
	tabbedPane.setSelectedIndex(0);
	add(tabbedPane,BorderLayout.CENTER);
	}
	
	JPanel createPane(String s)
	{
	JPanel p=new JPanel();
	p.add(new JLabel(s));
	return p;
	}
	
	public static void main(String... s)
	{
	JFrame frame=new JFrame("Tab Colror Example");
	frame.addWindowListener(new WindowAdapter()
	{
	public void WindowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	});
	
	frame.getContentPane().add(new TabColorExample());
	frame.setSize(400,400);
	frame.setVisible(true);
	}
	}
	
import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListSampleExample extends JFrame
{

public static void main(String... s)
{
new JListSampleExample();
}

private JList samplejlist;
private JTextField valuefield;

public JListSampleExample()
{
	super("create  simple jlist");
	WindowUtilities.setNativeLookAndFeel();
	addWindowListener(new ExitListener());
	
	Container c=getContentPane();
	//create the JList,set the no of visible rows, add a listner, and put in a JScrollPane
	
	String entries[]={"enrie1  ","enrie2  ","enrie3","enrie4","enrie5","enrie6"};
	samplejlist=new JList(entries);
	samplejlist.setVisibleRowCount(3);
	
	samplejlist.addListSelectionListener(new ValueReporter());
	
	JScrollPane listpane=new JScrollPane(samplejlist);
	JPanel listpanel=new JPanel();
	listpanel.setBackground(Color.WHITE);
	
	Border listpanelborder=BorderFactory.createTitledBorder("sample jlist");
	listpanel.setBorder(listpanelborder);
	listpanel.add(listpane);
	c.add(listpanel,BorderLayout.CENTER);
	JLabel valuelabel=new JLabel("last selection:");
	Font displayfont=new Font("Serif",Font.BOLD,18);
	valuelabel.setFont(displayfont);
	valuefield=new JTextField("none",7);
	valuefield.setFont(displayfont);
	JPanel valuepanel=new JPanel();
	valuepanel.setBackground(Color.WHITE);
	Border valuepanelborder=BorderFactory.createTitledBorder("jlist selection");
	valuepanel.setBorder(valuepanelborder);
	
	
	
	
	
	
	
	
	
	
	
	
	valuepanel.add(valuelabel);
	valuepanel.add(valuefield);
	c.add(valuepanel,BorderLayout.SOUTH);
	pack();
	setVisible(true);
	}
	private class ValueReporter implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent e)
		{
	valuefield.setText(samplejlist.getSelectedValue().toString());
}}}
	
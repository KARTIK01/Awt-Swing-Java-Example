import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyTable extends JFrame
{
	String heading[]={"name","add","salary"};
	String items[][]={{"amit","delhi","1000"},{"amit","delhi","1000"},{"amit","delhi","1000"}};
	
	public MyTable()
	{
		super("TABLE EXAMPLE");
		JTable jt=new JTable(items,heading);
		JScrollPane jp=new JScrollPane(jt);
		add(jp);
		pack();
		setVisible(true);
	}
	
	public static void main(String... s)
	{
	new MyTable();
}}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyMenu implements ActionListener
{
	JTextField tf=new JTextField();
	JFrame jf=new JFrame("MYFRAME");
	JMenuBar menubar;
	JMenu menu,submenu;
	JMenuItem menuitem,exit;
	JRadioButtonMenuItem rbmenuitem;
	JCheckBoxMenuItem cbmenuitem;
	
	MyMenu()
	{	tf.setBounds(50,100,100,50);
		jf.add(tf);
		menubar=new JMenuBar();
		menu=new JMenu("First menu");
		//menu.setMnemonic('F');     it is outdated only for a-z A-Z
		menu.setMnemonic(KeyEvent.VK_F);  /*If the character defined by the mnemonic is found within the button's label string, the first occurrence of it will be underlined to indicate the mnemonic to the user.*/
		menubar.add(menu);
		menuitem=new JMenuItem("A text only menu item",KeyEvent.VK_T);
		menuitem.addActionListener(this);
		menuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.ALT_MASK));
		menu.add(menuitem);
		//a group of radio button menu items
		menu.addSeparator();
		ButtonGroup group=new ButtonGroup();
		rbmenuitem=new JRadioButtonMenuItem("A radioButton menu item");
		rbmenuitem.setSelected(true);
		rbmenuitem.setMnemonic(KeyEvent.VK_R);
		
		group.add(rbmenuitem);
		menu.add(rbmenuitem);
		rbmenuitem=new JRadioButtonMenuItem("Another one");
		rbmenuitem.setMnemonic(KeyEvent.VK_O);
		group.add(rbmenuitem);
		menu.add(rbmenuitem);
		//a group of checkbox menuitem
		menu.addSeparator();
		
		cbmenuitem=new JCheckBoxMenuItem("A checkBox Menu ITem");
		cbmenuitem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbmenuitem);
		cbmenuitem=new JCheckBoxMenuItem("Another one");
		cbmenuitem.setMnemonic(KeyEvent.VK_H);
		menu.add(cbmenuitem);
		//a submenu
		menu.addSeparator();
		submenu =new JMenu("A SUBMENU");
		submenu.setMnemonic(KeyEvent.VK_S);
		
		menuitem=new JMenuItem("A item in submenu");
		menuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.ALT_MASK));
		submenu.add(menuitem);
		menu.add(submenu);
		exit=new JMenuItem("Exit");
		exit.addActionListener(this);
		menu.add(exit);
		
		//build second menu in menu bar
		menu=new JMenu("Another Menu");
		menu.setMnemonic(KeyEvent.VK_N);
		menubar.add(menu);
		jf.setJMenuBar(menubar);
		jf.setSize(300,400);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	if(e.getActionCommand().equals("Exit"))
	System.exit(0);
	if(e.getActionCommand().equals("A text only menu item"));
	tf.setText("hello");
	}
	public static void main(String... s)
	{
	new MyMenu();
	}
}	
	
	
		
 		
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class Browser extends JFrame implements HyperlinkListener,ActionListener
{
	public static void main(String... args)
	{
		if(args.length==0)
			new Browser("http://google.com");
		else
			new Browser(args[0]);
			
	}

private JTextField urlfield;
private JEditorPane htmlpane;
private String initalURL;

public Browser(String initalURL)
{
super("Simple swing Browser");
this.initalURL=initalURL;
addWindowListener(new ExitListener());
WindowUtilities.setNativeLookAndFeel();

JPanel toppanel=new JPanel();
toppanel.setBackground(Color.red);

JLabel urlLabel=new JLabel("URL");
urlfield=new JTextField(30);
urlfield.setText(initalURL);
urlfield.addActionListener(this);

toppanel.add(urlLabel);
toppanel.add(urlfield);
getContentPane().add(toppanel,BorderLayout.NORTH);

try{
htmlpane=new JEditorPane(initalURL);
htmlpane.setEditable(false);
htmlpane.addHyperlinkListener(this);
JScrollPane p=new JScrollPane(htmlpane);
//getContentPane().
add(p,BorderLayout.CENTER);
}catch(IOException e)
{
warnuser("cant build HTML pane for"+initalURL+e);
}

Toolkit t=getToolkit();

Dimension screenSize=t.getScreenSize();
int width=screenSize.width*8/10;
int height=screenSize.height*8/10;

setBounds(width/8,height/8,width,height);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
String url;
if(e.getSource()==urlfield)
	url=urlfield.getText();
else
	//click home button insted of entering URL
url=initalURL;


try
{
htmlpane.setPage(new URL(url));
urlfield.setText(url);
}
catch(IOException ioe)
{
warnuser("cant folo link to"+url+ioe);
}}

public void hyperlinkUpdate(HyperlinkEvent e)
{
if(e.getEventType()==HyperlinkEvent.EventType.ACTIVATED)
{
	try{
	htmlpane.setPage(e.getURL());
	urlfield.setText(e.getURL().toExternalForm());
	}
	catch(IOException ioe)
	{
	warnuser("cant folo link to"+e.getURL().toExternalForm()+":"+ioe);
	}}}
	private void warnuser(String s)
	{
	JOptionPane.showMessageDialog(this,s,"error",JOptionPane.ERROR_MESSAGE);
	}}


			
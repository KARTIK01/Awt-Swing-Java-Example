import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class JLabels extends JFrame
{
	public static void main(String... s)
	{
		new JLabels();
	}
	
	public JLabels()
	{
		super("using html in JLables");
		WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());
	
		Container content=getContentPane();
		
		Font font=new Font("serif",Font.PLAIN,30);
		content.setFont(font);
		String labelText="<html><FONT COLOR=RED>RED</FONT>AND"+"<FONT COLOR=BLUE>BLUE</FONT>TEXT</HTML>";
		
		JLabel coloredLabel=new JLabel(labelText,JLabel.CENTER);
		Border b=BorderFactory.createTitledBorder("Mixed Colors");
		
		coloredLabel.setBorder(b);
		content.add(coloredLabel,BorderLayout.NORTH);
		labelText="<html><b>Bold</b>and<i>italic</i>text</html>";
		
		JLabel boldLabel=new JLabel(labelText,JLabel.CENTER);
		boldLabel.setBorder(BorderFactory.createTitledBorder("Mixed fonts"));
		content.add(boldLabel,BorderLayout.CENTER);
		labelText="<html>india is good country"+
					"in the world"+
					"<p>"+
					"major cities are"+
					"<UL>"+
					"<LI>delhi"+
					"<LI>noida"+
					"<LI>mumbai"+
					"<LI>calculta"+
					"<LI>ghaziabad"+
					"<LI>khav"+
					"<LI>xfvf"+
					"<LI>fxvxf"+
					"<LI>etc"+
		            "</UL>";
		JLabel fancyLabel=new JLabel(labelText,JLabel.CENTER);
		fancyLabel.setBorder(BorderFactory.createTitledBorder("Multiline html"));
		content.add(fancyLabel,BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
}
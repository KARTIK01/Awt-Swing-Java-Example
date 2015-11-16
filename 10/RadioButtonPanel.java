import javax.swing.*;
import java.awt.*;
public class RadioButtonPanel extends JFrame
{
	public RadioButtonPanel(String labelstring,JRadioButton radiobutton[],ButtonGroup buttonGroup)
		{	super("frame");
			setLayout(new FlowLayout(FlowLayout.LEFT));
		   WindowUtilities.setNativeLookAndFeel();
			addWindowListener(new ExitListener());
			add(new JLabel(labelstring));
			
		for(int i=0;i<radiobutton.length;i++)
		{
			add(radiobutton[i]);
		}
		pack();
		setVisible(true);
		}
		
		public static void main(String... s)
		{ 
			JRadioButton jb[]=new JRadioButton[5];
			for(int i=0;i<jb.length;i++)
			{
				jb[i]=new JRadioButton(i+1+" ");
			}	ButtonGroup bg=new ButtonGroup();
				new RadioButtonPanel("gbe",jb,bg);
			
		}
}
	
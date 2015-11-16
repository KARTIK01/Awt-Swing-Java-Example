import java.awt.*;
import javax.swing.*;

public class JButtons extends JFrame
{
	public static void main(String... s)
	{
		new JButtons();
	}
	
	public JButtons()
	{
		super("using Jbuttons");
		
		WindowUtilities.setMotifLookAndFeel();
	//  WindowUtilities.setNativeLookAndFeel();
	//  WindowUtilities.setJavaLookAndFeel();
		
		addWindowListener(new ExitListener());
		Container content=getContentPane();
		content.setBackground(Color.YELLOW);
		content.setLayout(new FlowLayout());
		
		for(int i=0;i<4;i++)
		{
			JButton button=new JButton(" "+i);
			content.add(button);
		}
			
		pack();
		setVisible(true);
	}
}
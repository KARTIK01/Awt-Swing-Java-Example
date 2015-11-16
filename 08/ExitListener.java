import java.awt.*;
import java.awt.event.*;

public class ExitListener extends WindowAdapter
{
	public void windowClosing(WindowEvent Event)
	{
		System.exit(0);
	}
}
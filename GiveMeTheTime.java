package clock;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class GiveMeTheTime implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		Date now=new Date();
		System.out.println("It is "+ now);
		Toolkit.getDefaultToolkit().beep();
	}

}

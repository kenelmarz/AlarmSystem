package clock;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class AlarmSystem {
	public static void main(String[] args) {
		
		GiveMeTheTime listener=new GiveMeTheTime();
		Timer myTimer=new Timer(1000, listener);
		myTimer.start();
		JOptionPane.showMessageDialog(null, "Press accept to stop.");
		System.exit(0);
		}
}

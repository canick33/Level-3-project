import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class NextGenShreeeed {
	ArrayList<String> shred = new ArrayList<String>();
	ArrayList<String> theNar = new ArrayList<String>();
	public static void main (String[] args)
	{
		NextGenShreeeed taric = new NextGenShreeeed();
		taric.setup();
		taric.namePrint();

	}

	public void setup()
	{
		shred.add("Stripped");
		shred.add("Theeeeeeere");
		shred.add("Confused");
		shred.add("Rather Large");
		shred.add("Unwanted");
		theNar.add("cats");
		theNar.add("dogs");
		theNar.add("bricks");
		theNar.add("HugeAssFlyingDeathEagles");
		theNar.add("mice");
	
	}
	public void namePrint()
	{
		Random r = new Random();
		int x =r.nextInt(5);
		int y = r.nextInt(5);
		JOptionPane.showMessageDialog(null, shred.get(x)+ " "+ theNar.get(y));
	}
}

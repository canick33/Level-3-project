import java.util.Random;

public class Randomness {
	public boolean randBool()
	{
		Random r = new Random();
		if (r.nextInt(2) ==1)
		{
			return false;
		}
		return true;
	}
	
	public int randInt()
	{
		Random r = new Random();
		return r.nextInt(10);

	}

}

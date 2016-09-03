import java.util.ArrayList;

public class Train {
	int passengers;
	ArrayList<Rake> rakes;
	
	public Train(int p)
	{
		passengers = p;
	}
	
	public static void main(String[] args) {
		Train t = new Train(500);
		
		
		t.addRakes();
		System.out.println(t.calcDeaths());
		
		
	}
	public void addRakes()
	{
		rakes = new ArrayList<Rake>();
		Randomness r = new Randomness();

		for(int i =0;i<100;i++)
		{
			rakes.add(new Rake(r.randInt(),r.randBool()));
		}
	}
	
	public double calcDeaths()
	{
		int tVenom=0;
		for(int i =0;i<100;i++)
		{
			if(rakes.get(i).isPointy())
			{
				tVenom += rakes.get(i).getVicious();
			}
			
		}
		return tVenom*10 /passengers;
	}

}

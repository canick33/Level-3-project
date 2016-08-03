import java.util.ArrayList;

public class Sky {
	ArrayList<Star> stars;
	
	public static void main(String[] args) {
		Sky s = new Sky();
		s.run();
	}
	public Sky()
	{

	}
	
	public void run()
	{
		stars = new ArrayList<Star>();
		stars.add(new Star("thatStar"));
		System.out.println(stars.get(0).getName());
	}

}

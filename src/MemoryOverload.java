import java.util.ArrayList;

public class MemoryOverload {
	public static void main(String[] args) {
		MemoryOverload doNot = new MemoryOverload();
		doNot.setup();
	}
	public void setup()
	{
		ArrayList<String> borks = new ArrayList<String>();
		for(long i=0; i<10000000000000000l; i++)
		{
			borks.add("bork");
		}
	}
}

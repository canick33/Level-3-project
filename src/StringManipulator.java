
public class StringManipulator {
	public String capitalizeWord(String x)
	{
		return x.toUpperCase();
	}
	public String reverseWord(String x)
	{
		String reverse = new StringBuffer(x).reverse().toString();
		return reverse;
	}
	
	public String uncapitalizeWord(String x)
	{
		return x.toLowerCase();
	}

}

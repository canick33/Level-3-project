
public class Fibs {
	public static void main(String[] args) {
		int x =0;
		int y =1;
		int z =0;
		
		for(int i=0;i<10;i++)
		{
			z = add(x,y);
			x = y;
			y=z;
			
			System.out.println(x+" "+isPrime(x));
		}
		
	}
	
	public static int add(int x,int y)
	{
		return x+y;
	}
	public static boolean isPrime(int x)
	{
		if(x==2)
		{
			return true;
		}
		if(x%2 ==0)
		{
			return false;
		}
	
		double max = Math.sqrt(x);
		
		for(int i =3; i<max;i+=2)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
}





import java.sql.Date;

public class PrimeTest {
	public static void main(String[] args) {
		Primes p = new Primes();
		Date start = new Date(System.currentTimeMillis());
		long t1 = start.getTime();
		for(int i =0;i<1000000;i++)
		{
			p.isPrime(i);
			//System.out.println(i+" :"+p.isPrime(i));
		}
		Date end = new Date(System.currentTimeMillis());
		long t2 = end.getTime();
		System.out.println(t2-t1);
	}

}

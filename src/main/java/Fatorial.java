import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int n;
		BigInteger fator = new BigInteger("1");
		BigInteger fator1 = new BigInteger("1");
		
		n = s.nextInt();
		
		// n*(n - 1)*(n - 2)*(n - 3)*(n - ... a)
		
		for(int i = 2; i <= n ; i++) 
		{
			//fator1 = String.valueOf(i);
			
			fator1 = new BigInteger(String.valueOf(i));
			
			//fator = fator*i;
			
			fator = fator.multiply(fator1);
		}
		
		System.out.println(fator);
				
	}

}

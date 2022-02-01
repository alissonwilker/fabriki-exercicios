import java.util.Scanner;
import java.math.BigInteger;
public class Fatorial {

	public static void main(String args[]) {
		final Scanner entrada = new Scanner(System.in);
		int x;
		x=entrada.nextInt();
		BigInteger f=BigInteger.valueOf(x);
		if (x==0 || x==1) {
			System.out.println(1);
		}
		else {
			while (x>1 && x<=25) {
				f=f.multiply(BigInteger.valueOf(x-1));
				x--;
			}
			System.out.println(f);
			
		}
		
	}
}

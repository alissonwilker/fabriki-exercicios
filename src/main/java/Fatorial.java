import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		BigInteger fat = BigInteger.ONE;

		while (n > 1) {
			fat = fat.multiply(BigInteger.valueOf(n));
			n--;
		}
		
		System.out.println(fat);
	}
}

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
		BigInteger fat = BigInteger.ONE;
		
		n = entrada.nextInt();
		
		if (n >= 0) {
			for (int i = 1; i <= n; i++) {
				fat = fat.multiply(BigInteger.valueOf(i));
			}
		}
		System.out.println(fat);
	}
}

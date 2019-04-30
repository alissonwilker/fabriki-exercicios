import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	private static final int Far = 0;

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int valor = S.nextInt();
		BigInteger Fat = new BigInteger("1");
		BigInteger j = new BigInteger("1");

		for (int i = 1; i <= valor; i++) {
		  Fat = Fat.multiply(j);
          j = j.add(new BigInteger("1"));
		}
		System.out.println(Fat);
	}
}

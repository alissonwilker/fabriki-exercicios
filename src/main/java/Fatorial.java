import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
		BigInteger fat = BigInteger.valueOf(1);

		for (int i = 2; i <= x; i++) {
			BigInteger ind = BigInteger.valueOf(i);
			fat = fat.multiply(ind);
		}
		System.out.println(fat);

	}

}


import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();

		BigInteger fat = BigInteger.valueOf(1L);

		for (int i = n; i >= 2; i--) {
			fat = fat.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fat);
		//return fat;
	}

}

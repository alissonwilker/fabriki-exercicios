import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int fator = entrada.nextInt();
		entrada.close();
		BigInteger fatorial = new BigInteger("1");
		for (int i = fator; i > 0; i--) {
			BigInteger indice = BigInteger.valueOf(i);
			fatorial = fatorial.multiply(indice);
		}

		System.out.println(fatorial);

	}
}

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numero = entrada.nextInt();
		BigInteger fatorial = BigInteger.valueOf(1);
		for (int n = 1; n <= numero; n ++) {
			fatorial = fatorial.multiply(BigInteger.valueOf(n));
		}
		saida.println(fatorial);
	}
}

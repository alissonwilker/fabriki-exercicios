import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		BigInteger numero = new BigInteger("1", 10);
		int fat = entrada.nextInt();
		for (int i = 1; i <= fat; i++) {
			numero = numero.multiply(BigInteger.valueOf(i));

		}
		saida.println(numero);
	}
}

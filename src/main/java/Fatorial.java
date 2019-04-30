import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		BigInteger fatorial = new BigInteger("1");
		BigInteger j = new BigInteger("1");

		int valor = entrada.nextInt();
		for (int i = 1; i <= valor; i++) {
			fatorial = fatorial.multiply(j);
			j = j.add(new BigInteger("1"));
		}
		
		saida.println(fatorial);
	}
}

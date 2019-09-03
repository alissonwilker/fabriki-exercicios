import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int n1 = entrada.nextInt();
		BigInteger fatorial = BigInteger.valueOf(1);
		
		for (int i = 1; i <= n1; i++) {	
			fatorial = fatorial.multiply(BigInteger.valueOf(i));
		}

		saida.println(fatorial);
	}
}

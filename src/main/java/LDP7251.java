import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numeros;
		int maior =0;
		int cont = 1;

		numeros = entrada.nextInt();

		do {

			if (maior < numeros) {
				maior = numeros;
				cont++;
			}if (maior > numeros) {
				maior = numeros;
				cont--;
			}else {
				maior = numeros;
			}
			numeros = entrada.nextInt();

		} while ( numeros != 0 );
		
		saida.println("maior = "+maior);
	}
}

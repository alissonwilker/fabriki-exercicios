import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int maior = Integer.MIN_VALUE;
		int numero = entrada.nextInt();
		maior = numero;
		while (numero != 0) {
			numero = entrada.nextInt();
			if (numero>maior) {
				maior = numero;
			}
		}	
		saida.println("maior = " + maior);
	}
}

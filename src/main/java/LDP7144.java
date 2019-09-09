import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numero = entrada.nextInt();
		saida.println((numero % 2 == 0? "PAR":"ÍMPAR")+ " E " +(numero >= 0? "POSITIVO":"NEGATIVO"));
				
	}

}

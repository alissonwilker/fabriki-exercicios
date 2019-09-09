import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int num = entrada.nextInt();
		String valor1 = (num % 2 == 0) ? "PAR E " : "ÍMPAR E ";
		String valor2 = (num < 0) ? "NEGATIVO" : "POSITIVO";

		saida.println(valor1+valor2);
	}

}

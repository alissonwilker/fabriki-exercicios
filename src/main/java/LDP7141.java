import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int peso = entrada.nextInt();

		if (peso > 50) {
			saida.println("excedente = " + (peso - 50));
			saida.println("multa = " + (peso - 50) * 4);
		} else {
			saida.println("excedente = 0");
			saida.println("multa = 0");
		}
	}
}

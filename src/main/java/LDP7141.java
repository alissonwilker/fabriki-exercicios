import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int excesso, multacalc, multa = 4;
		int pesoPeixes = entrada.nextInt();

		if (pesoPeixes > 50) {
			excesso = pesoPeixes - 50;
			multacalc = excesso * multa;
			saida.println("excedente = " + excesso);
			saida.println("multa = " + multacalc);
		} else {
			saida.println("excedente = 0");
			saida.println("multa = 0");
		}
	}
}

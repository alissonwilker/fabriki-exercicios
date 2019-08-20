import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int total = entrada.nextInt();
		if (total <= 50) {
			saida.println("excedente = 0");
			saida.println("multa = 0");
		} else {
			int excedente = total - 50;
			int multa = excedente * 4;
			saida.println("excedente = " + excedente);
			saida.println("multa = " + multa);
		}
	}
}

import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int peso = entrada.nextInt();
		int excedente = 0;
		int multa = 0;
		if (peso > 50) {
			excedente = peso - 50;
			multa = 4*excedente;
			saida.println("excedente " + excedente);
			saida.println("multa " + multa);
		}else {
			saida.println("excedente " + excedente);
			saida.println("multa " + multa);
		}

	}

}

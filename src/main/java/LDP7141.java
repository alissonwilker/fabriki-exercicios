import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int pesoPeixes = entrada.nextInt();
		int excedente = 0;
		int multa = 0;
		if (pesoPeixes > 50) {
			excedente = pesoPeixes - 50;
			multa = excedente * 4;
		}
		saida.println("excedente = " + excedente);
		saida.println("multa = " + multa);
	}

}

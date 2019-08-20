
import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int peso = entrada.nextInt();

		if (peso >= 50) {
			int excedente = peso - 50;
			int multa = excedente * 4;
			saida.println("excedente = " + excedente + "\n" + "multa = " + multa);
		} else {
			saida.println("excedente = 0" + "\n" + "multa = 0");
		}

	}

}

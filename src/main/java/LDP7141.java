import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int peso = entrada.nextInt();
		int excedente;
		int multa;
		if (peso > 50) {
			excedente = (peso - 50);
			multa = (excedente * 4);

			saida.println("excedente = " + excedente);
			saida.println("multa = " + multa);

		}

		else 
				{
			saida.println("excedente = 0");
			saida.println("multa = 0");
		}

	}
}

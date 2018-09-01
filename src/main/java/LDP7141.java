import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	int pesoEnt;

	public static void main(String[] args) {
		int excedente = 0;
		int multa = 0;
		int pesoEnt;
		
		pesoEnt = entrada.nextInt();

		if (pesoEnt <= 50) {
			excedente = 0;
			multa = 0;
			saida.println("excedente = " + excedente);
			saida.println("multa = " + multa);

		} else if (pesoEnt > 50) {
			excedente = pesoEnt - 50;
			multa = excedente * 4;
			saida.println("excedente = " + excedente);
			saida.println("multa = " + multa);
		}

	}

}

import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO INSIRA SEU CÓDIGO AQUI
		// saida.println("Digite o valor: ");
		int valor = entrada.nextInt();
		int reg = 50;
		if (valor >= reg) {
			int exced = valor - reg;
			System.out.println("excedente = " + exced);
			int multa = exced * 4;
			saida.println("multa = " + multa);
		} else if (valor < reg) {
			int exced = 0;
			System.out.println("excedente = " + exced);
			int multa = 0;
			saida.println("multa = " + multa);
		}

	}

}

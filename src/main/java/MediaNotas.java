
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);

		double soma = 0;

		int qtnotas = entrada.nextInt();
		int[] nota = new int[qtnotas];

		for (int i = 0; i < qtnotas; i++) {
			nota[i] = entrada.nextInt();
			soma += nota[i];
		}

		double media = soma / qtnotas;

		saida.println("media = " + formatador.format(media));

		for (int i = 0; i < qtnotas; i++) {

			saida.println("nota " + (i + 1) + " = " + formatador.format(nota[i]));

		}

	}

}

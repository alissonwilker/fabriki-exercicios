import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int quantn = entrada.nextInt();
		int[] nota = new int[quantn];
		int soma = 0;
		double media;

		for (int i = 0; i < quantn; i++) {
			nota[i] = entrada.nextInt();
			soma += nota[i];
		}
		media = soma / quantn;

		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);

		saida.println("media = " + formatador.format(media));

		for (int i = 0; i < quantn; i++) {
			saida.println("nota " + (i + 1) + " = " + formatador.format(nota[i]));
		}

	}

}

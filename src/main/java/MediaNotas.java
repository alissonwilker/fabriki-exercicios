import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int qtdeNotas = entrada.nextInt();
		int i;
		double soma = 0, media = 0;

		int nota[] = new int[qtdeNotas];

		for (i = 0; i <= nota.length-1 ; i++) {
			nota[i] = entrada.nextInt();
			soma = soma + nota[i];
		}

		media = soma / qtdeNotas;

		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		saida.println("media = " + formatador.format(media));
		for (i = 0; i < nota.length; i++) {
			saida.println("nota " +(i+1)+" = "+ formatador.format(nota[i]));
		}
	}

}

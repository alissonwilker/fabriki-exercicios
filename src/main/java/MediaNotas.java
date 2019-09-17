import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int num;
		double notas[] = new double[500];
		double soma = 0;
		num = entrada.nextInt();
		for (int i = 0; i < num; i++) {
			notas[i] = entrada.nextDouble();
			soma += notas[i];
		}
		double media = soma / num;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		saida.println("media = " + formatador.format(media));
		for (int i = 0; i < num; i++) {
			saida.println("nota " + (i + 1) + " = " + formatador.format(notas[i]));
		}
	}
}

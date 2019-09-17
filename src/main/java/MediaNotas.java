import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, i;
		double nota[] = new double[100];
		double media;
		double soma = 0;

		n = entrada.nextInt();
		for (i = 0; i < n; i++) {
			nota[i] = entrada.nextDouble();
			soma += nota[i];
		}
		media = soma / n;
		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		saida.println("media = " + formatador.format(media));
		for (i = 0; i < n; i++) {
			saida.println("nota" + (i + 1) + " = " + formatador.format(nota[i]));
		}
	}

}

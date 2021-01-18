import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		
		int qtdeNotas = entrada.nextInt();
		
		for (int i =0; i < qtdeNotas; i++) {
			int [] notas = new int [i];
			notas[i] = entrada.nextInt();
			double media = notas[i] /qtdeNotas;
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
			formatador.setMinimumFractionDigits(1);
			formatador.setMaximumFractionDigits(1);

			System.out.println("media = " + formatador.format(media));
			System.out.println("nota" + notas[i] + "=" + formatador.format (notas[i]));
		}
		
	}

}

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		int quantNotas = entrada.nextInt();
		int[] nota = new int [quantNotas];
		double soma = 0;
		double media;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		for (int i = 0; i < quantNotas; i++) {
			nota[i] = entrada.nextInt();
			soma += nota[i];
		}
		
		media = soma / quantNotas;
		formatador.format(media);
		
		saida.println("media = " + formatador.format(media));
		
		for (int i = 0; i < quantNotas; i++) {
			saida.println("nota " + i + " = " + formatador.format(nota[i]));
		}
	}
}

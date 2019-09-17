
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int qtdNotas = entrada.nextInt();
		double somaNotas = 0;
		double media = 0;
		NumberFormat formatador = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
		int[] notas = new int[qtdNotas];
		
		for (int i=0; i < qtdNotas; i++) {
			
			
			notas[i] = entrada.nextInt();
			somaNotas = somaNotas + notas[i];
			
			media = somaNotas / qtdNotas;
			formatador.format(media);
			formatador.setMinimumFractionDigits(1);
			formatador.setMaximumFractionDigits(1);
			
			
		}
		saida.println("media = " + formatador.format(media));
		
		for (int i=0; i<qtdNotas; i++) {
			saida.println("nota " + i + " = " + formatador.format(notas[i]));
		}
		
		

	}

}

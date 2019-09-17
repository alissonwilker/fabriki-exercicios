import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = entrada.nextInt();
		int notas[] = new int [n];
		double soma = 0;
		int qtdeNotas = n;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);
		
		for(int i = 0; i<n; i++) {
			
			notas[i] = entrada.nextInt();
			soma += notas[i];
		}
		double media = soma /qtdeNotas;
		System.out.println("media = " + formatador.format(media));
		
		for(int i = 0; i<notas.length; i++) {
		System.out.println("nota "+(i+1)+" = "+ formatador.format(notas[i]));
		}
		
	}

}

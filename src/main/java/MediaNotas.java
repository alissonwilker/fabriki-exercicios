import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double soma = 0; 
	int qtNotas = entrada.nextInt();
	int[] notas = new int[qtNotas];
	
	for (int i = 0; i < qtNotas; i++) {
		notas[i] = entrada.nextInt();
		soma += notas[i];
		 
	}
	
	double media = soma / qtNotas; 

	NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

	formatador.setMinimumFractionDigits(1);

	formatador.setMaximumFractionDigits(1);

	System.out.println("media = " + formatador.format(media));
	
	
	for (int i = 0; i < notas.length; i++) {
		System.out.println("nota " + (i+1) + " = "+ formatador.format(notas[i]));
		}
		
	}
		   
	
}

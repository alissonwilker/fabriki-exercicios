import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		int qtdNotas = scanner.nextInt();
		int notas[] = new int[qtdNotas];
		double soma = 0;
		double media;
		
		for (int i = 0; i < qtdNotas; i++) {
			notas[i] = scanner.nextInt();
			soma += notas[i];
		}
		
		media = (double)soma / qtdNotas;
		System.out.println("media = " + formatador.format(media));
		
		for (int i = 0; i < qtdNotas; i++) {
			System.out.println("nota "+ (i+1) +" = " + formatador.format(notas[i]));
		}
		
		
		
		
	}

}

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public MediaNotas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// número de notas
		
		int qtd = scanner.nextInt();
		int notas[] = new int[qtd];
		double soma = 0;
		
		for (int i = 0; i < qtd; i++) {
			notas[i] = scanner.nextInt();
		}
		
		
		for (int i = 0; i < qtd; i++) {
			soma = soma + notas[i];
		}
		
		//média
				
		double media = soma / qtd;

		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);

		System.out.println("media = " + formatador.format(media));
		for (int i = 0; i < notas.length; i++) {
			System.out.println("nota "+(i+1)+" = "+formatador.format(notas[i]));
		}
	}

}


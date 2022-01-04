import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int soma=0;
		int qtdeNotas;
		qtdeNotas = teclado.nextInt();
		int[] vetorNotas  = new int[qtdeNotas];

		for(int i=0; i < qtdeNotas; i++) {
			vetorNotas[i] = teclado.nextInt();
			soma = soma + vetorNotas[i];
		}
		

		double  media = soma / qtdeNotas;

		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);

		System.out.println("media = " + formatador.format(media));
		
		for(int i=0; i<qtdeNotas;  i++) {
			System.out.println("nota " + (i+1) + " = " + formatador.format(vetorNotas[i]));
		}
	}

}

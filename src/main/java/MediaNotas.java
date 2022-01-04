import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int soma=0;
// Ler um inteiro; inteiro := quantidade de notas
		int qtdeNotas;
		qtdeNotas = teclado.nextInt();
		int[] vetorNotas  = new int[qtdeNotas];
// Ler notas em formato inteiro, conforme quantidade entrada anteriormente
		for(int i=0; i < qtdeNotas; i++) {
			vetorNotas[i] = teclado.nextInt();
			soma = soma + vetorNotas[i];
		}
		
		
		
// 	apresentar a média das notas e cada nota	
		// Calcular media
		double  media = (double) soma / qtdeNotas;
		// Apresentar media em formato ,0
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);

		System.out.println("media = " + formatador.format(media));
		
		for(int i=0; i<qtdeNotas;  i++) {
			System.out.println("nota " + (i+1) + " = " + formatador.format(vetorNotas[i]));
		}
	}

}

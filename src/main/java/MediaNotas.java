import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.lang.Math;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double media = 0;
		double soma = 0;
		int qtdeNotas = entrada.nextInt();
		int[] notas = new int[qtdeNotas];
		
		for (int i = 0; i < qtdeNotas; i++) {
			notas[i] = entrada.nextInt();
			soma += notas[i];
		}
		
		media = soma / qtdeNotas;
		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);

		System.out.println("media = " + formatador.format(media));
		for(int i = 0; i < notas.length; i++) {
			System.out.print("nota " + (i+1) + " = " + formatador.format(notas[i]) + "\n");
		}
		entrada.close();
	}

}

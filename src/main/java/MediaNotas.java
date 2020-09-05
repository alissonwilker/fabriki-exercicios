import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);

		int nota = 0;
		double soma = 0;
		double media = 0;
		int qtdeNotas;

		System.out.println("Digite a quantidade de notas");
		qtdeNotas = entrada.nextInt();

		if (qtdeNotas > 0) {
			int[] notas = new int[qtdeNotas];

			for (int i = 0; i < qtdeNotas; i++) {
				notas[i] = entrada.nextInt();
				soma += notas[i];

			}

			media = (soma / qtdeNotas);
			System.out.println("media = " + formatador.format(media));

			for (int i = 0; i < qtdeNotas; i++) {
				System.out.println("nota " + (i + 1) + " = " + formatador.format(notas[i]));
			}

		} else
			System.out.println("Digite um valor maior que 0");

	}

}

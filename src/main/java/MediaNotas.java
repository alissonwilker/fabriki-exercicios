
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota = 0;
		int qtdeNotas = teclado.nextInt();
		int[] ANotas = new int[qtdeNotas];
		double soma = 0, media = 0;

		for (int i = 0; i < qtdeNotas; i++) {
			nota = teclado.nextInt();
			ANotas[i] = nota;
			soma += nota;

		}
		media = soma / qtdeNotas;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);

		System.out.println("media = " + formatador.format(media));
		int contador = 0;
		for (int j = 0; j < ANotas.length; j++) {
			contador++;
			System.out.println("nota " + contador + " = " + ANotas[j]);
		}

	}
}

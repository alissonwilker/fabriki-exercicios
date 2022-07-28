import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int entrada = scanner.nextInt();
		int i;

		int qnotas = entrada;
		if (qnotas <= 0) {
			qnotas = scanner.nextInt();
		} else {
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

			formatador.setMinimumFractionDigits(1);

			formatador.setMaximumFractionDigits(1);
			double notas[] = new double[qnotas];
			double soma = 0;
			for (i = 0; i < qnotas; i++) {

				notas[i] = scanner.nextDouble();
				soma = soma + notas[i];
			}
			scanner.close();
			double media = soma / qnotas;
			System.out.println("media = " + formatador.format(media));
			for (i = 0; i < notas.length; i++) {
			Arrays.sort(notas);
				System.out.println(("nota ")+(i+1)+" = "+ notas[i]);
			};
			}

	
		}
	}

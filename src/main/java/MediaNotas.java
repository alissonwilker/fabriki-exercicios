import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);

		int quantidadeDeNotas = leitor.nextInt();
		while (quantidadeDeNotas == 0) {
			quantidadeDeNotas = leitor.nextInt();
		}
		int[] notas = new int[quantidadeDeNotas];
		double somaTotal = 0;
		for (int i = 0; i < quantidadeDeNotas; i++) {
			notas[i] = leitor.nextInt();
			somaTotal += notas[i];
		}

		double media = somaTotal / quantidadeDeNotas;
		System.out.println("media = " + formatador.format(media));
		
		for (int i = 0; i < notas.length; i++) {
			double nota = (double) notas[i];
			System.out.println("nota = " + formatador.format(nota));
		}

		leitor.close();
	}
}

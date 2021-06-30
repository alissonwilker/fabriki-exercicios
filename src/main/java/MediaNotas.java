import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

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
		System.out.printf("media = %.1f\n", media);
		for (int i = 0; i < notas.length; i++) {
			double nota = (double) notas[i];
			System.out.printf("nota %d = %.1f \n",i+1, nota);
		}

		leitor.close();
	}
}

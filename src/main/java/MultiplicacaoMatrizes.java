import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int linhaA = entrada.nextInt();
		int colunaA = entrada.nextInt();
		int colunaB = entrada.nextInt();
		int linhaB = colunaA;

		int[][] ma = new int[linhaA][colunaA];
		int[][] mb = new int[linhaB][colunaB];
		int[][] mab = new int[linhaA][colunaB];

		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {

				ma[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < mb.length; i++) {
			for (int j = 0; j < mb[i].length; j++) {
				mb[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < mab.length; i++) {
			for (int j = 0; j < mab[i].length; j++) {
				for (int k = 0; k < ma[i].length; k++) {
					mab[i][j] += ma[i][k] * mb[k][j];

				}
				System.out.println(mab[i][j]);
			}
		}

	}

}

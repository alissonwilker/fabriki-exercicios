import java.util.Scanner;

public class MultiplicacaoMatrizes {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int linhaA = entrada.nextInt();
		int colunaA = entrada.nextInt();
		int colunaB = entrada.nextInt();
		int linhaB = colunaA;

		int[][] matrizA = new int[linhaA][colunaA];
		int[][] matrizB = new int[linhaB][colunaB];
		int[][] matrizC = new int[linhaA][colunaB];

		for (int i = 0; i < linhaA; i++)
			for (int j = 0; j < colunaA; j++) {
				matrizA[i][j] = entrada.nextInt();
			}

		for (int i = 0; i < linhaB; i++)
			for (int j = 0; j < colunaB; j++) {
				matrizB[i][j] = entrada.nextInt();
			}

		for (int i = 0; i < linhaA; i++) {
			for (int j = 0; j < colunaB; j++) {

				for (int k = 0; k < linhaB; k++) {
					matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
				}
				System.out.println(matrizC[i][j]);
			}

		}

	}

}

import java.util.Scanner;

public class MultiplicacaoMatrizes {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int linhaA = entrada.nextInt();
		int colunaA = entrada.nextInt();
		int colunaB = entrada.nextInt();

		int[][] matrizA = new int[linhaA][colunaA];
		int[][] matrizB = new int[colunaA][colunaB];
		int[][] matrizAB = new int[linhaA][colunaB];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				matrizB[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				for (int k = 0; k < matrizB[0].length; k++) {
					matrizAB[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}

		for (int i = 0; i < matrizAB.length; i++) {
			for (int j = 0; j < matrizAB[0].length; j++) {
				System.out.println(matrizAB[i][j]);
			}
		}
	}
}

package atividade;
import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int linhaA = leitor.nextInt();
		int colunA = leitor.nextInt();
		int colunB = leitor.nextInt();

		int matrizA[][] = new int[linhaA][colunA];
		int matrizB[][] = new int[colunA][colunB];

		for (int a = 0; a < matrizA.length; a++) {
			for (int b = 0; b < matrizA[0].length; b++) {
				matrizA[a][b] = leitor.nextInt();
			}
		}

		for (int c = 0; c < matrizB.length; c++) {
			for (int d = 0; d < matrizB[0].length; d++) {
				matrizB[c][d] = leitor.nextInt();
			}
		}

		int[][] matrizC = new int[matrizA.length][matrizB[0].length];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				for (int k = 0; k < matrizB.length; k++) {
					matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}

		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[0].length; j++) {
				System.out.println(matrizC[i][j]);
			}
		}

		leitor.close();

	}

}

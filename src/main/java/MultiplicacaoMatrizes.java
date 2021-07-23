package atividade;
import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int linhaA = leitor.nextInt();
		int colunaA = leitor.nextInt();
		int colunaB = leitor.nextInt();

		int matrizA[][] = new int[linhaA][colunaA];
		int matrizB[][] = new int[colunaA][colunaB];

		for (int a = 0; a < linhaA; a++) {
			for (int b = 0; b < colunaA; b++) {
				matrizA[a][b] = leitor.nextInt();
			}
		}

		for (int c = 0; c < colunaA; c++) {
			for (int d = 0; d < colunaB; d++) {
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

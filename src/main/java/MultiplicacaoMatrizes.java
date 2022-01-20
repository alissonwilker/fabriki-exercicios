import java.util.Scanner;

public class MultiplicacaoMatrizes {
	public static void main(String [] args) {
		final Scanner entrada = new Scanner(System.in);



		int linhaA;
		int colunaA;

		int colunaB;
		linhaA=entrada.nextInt();
		colunaA=entrada.nextInt();

		colunaB=entrada.nextInt();

		int[][] matrizA = new int[linhaA][colunaA];
		int[][] matrizB=new int[colunaA][colunaB];
		int[][] matrizC=new int[linhaA][colunaB];
		for (int linha = 0; linha < linhaA; linha++) {
			for (int coluna = 0; coluna < colunaA; coluna++) {
				matrizA[linha][coluna]=entrada.nextInt();
			}
		}
		for (int linha = 0; linha < colunaA; linha++) {
			for (int coluna = 0; coluna < colunaB; coluna++) {
				matrizB[linha][coluna]=entrada.nextInt();
			}
		}
		for (int linha = 0; linha < linhaA; linha++) {
			for (int coluna = 0; coluna < colunaB; coluna++) {
				for (int k = 0; k <colunaA; k++) {
					matrizC[linha][coluna] += matrizA[linha][k] * matrizB[k][coluna]; 
				}
			}
		}
		for (int linha = 0; linha < linhaA; linha++) {
			for (int coluna = 0; coluna < colunaB; coluna++) {
				System.out.println(matrizC[linha][coluna]);
				
			}
		}

	}
}

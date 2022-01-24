import java.util.Scanner;

public class MultiplicacaoMatrizes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int linhaA, colunaA, colunaB, linhaB;
		linhaA = sc.nextInt();
		colunaA = sc.nextInt();
		
		int[][] matrizA = new int [linhaA][colunaA];

		colunaB = sc.nextInt();
		linhaB = colunaA;
		
		
		int[][] matrizB = new int [linhaB][colunaB];
		
		for (int i=0; i < linhaA; i++) {
			for (int j=0; j <colunaA; j++) {
				matrizA[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i <linhaB; i++) {
			for (int j=0; j < colunaB; j++) {
				matrizB[i][j] = sc.nextInt();
			}
		}
		
			
		int[][] matrizC = new int[linhaA][colunaB];
		
		for (int i=0; i < linhaA; i++) {
			for (int j=0; j < colunaB; j++) {
				for (int k=0; k < linhaB; k++) {
					matrizC[i][j] += matrizA[i][k] * matrizB[k][j]; 
				}
 
			}
		}
		
		for (int i=0; i < linhaA; i++) {
			for (int j=0; j <colunaB; j++) {
				System.out.println(matrizC[i][j]);
			}
		}
		
		sc.close();
	}
}

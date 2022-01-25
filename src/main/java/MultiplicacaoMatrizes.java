import java.util.Scanner;

public class MultiplicacaoMatrizes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 

		int linhaA = 0 ;
		int colunaA = 0 ;
		int colunaB = 0;
		
		linhaA = entrada.nextInt();
		colunaA = entrada.nextInt();
		
		int[][] matrizA = new int [linhaA][colunaA];

		colunaB = entrada.nextInt();
		
		int[] matrizB = new int [colunaB];
		
		for (int i=0; i < linhaA; i++) {
			for (int j=0; j <colunaA; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		}
		
		for (int j=0; j <colunaB; j++) {
			matrizB[j] = entrada.nextInt();
		}
					
		int[][] matrizC = new int[linhaA][colunaB];
		for (int i=0; i < linhaA; i++) {
			for (int j=0; j < colunaB; j++) {
				for (int k=0; k < colunaA; k++) {
					matrizC[i][j] += matrizA[i][k] * matrizB[j]; 
				}
 
			}
		}
		
		System.out.println();
		
		for (int i=0; i < linhaA; i++) {
			for (int j=0; j <colunaB; j++) {
				System.out.println(matrizC[i][j]);
			}
		}
				
	}
}

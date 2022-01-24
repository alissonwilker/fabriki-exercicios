import java.util.Scanner;

public class MultiplicacaoMatrizes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int linhaA, colunaA, colunaB, linhaB;
		//System.out.println("Digite a quantidade de linhas");
		linhaA = sc.nextInt();
		//System.out.println("Digite a quantidade de colunas");
		colunaA = sc.nextInt();
		
		int[][] matrizA = new int [linhaA][colunaA];

		//System.out.println("Digite a quantidade de colunas");
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
		
		//for (int i=0; i < linhaA; i++) {
		//	for (int j=0; j <colunaA; j++) {
		//		System.out.print(matrizA[i][j] + " ");
		//	}
		//	System.out.println("");
		//}
		
		//System.out.println();
		
		//for (int j=0; j <colunaB; j++) {
		//	System.out.print(matrizB[j] + " ");
		//}
		
		//System.out.println();
			
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
	

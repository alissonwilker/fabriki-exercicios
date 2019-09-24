import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	private static PrintStream saida = System.out;
	private static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		int linhaA = entrada.nextInt();
		int colunaA = entrada.nextInt();
		int colunaB = entrada.nextInt();
		
		
		int[][] matrizA = new int[linhaA][colunaA];
		int[][] matrizB = new int[colunaA][colunaB];
		int[][] matrizAxB = new int[matrizA.length][matrizB[0].length];
		
		
		for (int i = 0; i < linhaA; i++) {
			for (int j=0; j < colunaA; j++) {
				matrizA[i][j] = entrada.nextInt();

			}
		}
		
		for (int i = 0; i < colunaA; i++) {
			for (int j = 0; j < colunaB; j++) {
				matrizB[i][j] = entrada.nextInt();
			}
		}
		
		
		for (int linhas = 0; linhas < matrizAxB.length; linhas++) {
			
			  for (int colunas = 0; colunas < matrizAxB[0].length; colunas++) {
				  
			    for (int multiplicacao = 0; multiplicacao < matrizB.length; multiplicacao++) {
			    	
			      matrizAxB[linhas][colunas] += matrizA[linhas][multiplicacao] * matrizB[multiplicacao][colunas]; 
			    	}
			    saida.println(matrizAxB[linhas][colunas]);
			    }
			  }

		}
	}

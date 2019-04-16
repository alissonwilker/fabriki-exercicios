import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int linhas1, linhas2;
		int colunas1, colunas2;

	
		linhas1 = entrada.nextInt();
		
		colunas1 = entrada.nextInt();
		
		colunas2 = entrada.nextInt();

		int[][] matrizA = new int[linhas1][colunas1];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				
			}
			
		}
						
		linhas2 = colunas1;

		int[][] matrizB = new int[linhas2][colunas2];

		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				matrizB[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				
			}
			
		}
		
		int matrizC [][] = new int [linhas1] [colunas2];
		for (int i=0; i<matrizA.length; i++) {
			for (int j=0; j<matrizB[0].length; j++) {
				for (int k=0; k<matrizA[0].length; k++) {
					matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		} 
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[0].length; j++) {
				System.out.println(matrizC[i][j]);
		}
		
	}
}
}

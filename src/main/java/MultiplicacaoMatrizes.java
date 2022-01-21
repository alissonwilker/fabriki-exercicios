import java.util.Scanner;

public class MultiplicacaoMatrizes {  

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
			int linhasA = scanner.nextInt();
			int colunasA = scanner.nextInt();
		    int linhasB = colunasA;//igual às linhas de B como pré-requisito.
			int colunasB = scanner.nextInt();
			int[][] matrizA = new int[linhasA][colunasA]; 
			int[][] matrizB = new int[linhasB][colunasB]; 
			
			leiaMatriz(matrizA); 
			leiaMatriz(matrizB);
			int[][] matrizC = MultiplicaMatrizes(matrizA, matrizB);
			ImprimaMatriz(matrizC);
	}
	
	public static void leiaMatriz(int[][] matriz) { 
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}
	}

	public static void ImprimaMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}
	public static int[][] MultiplicaMatrizes(int[][] matrizA, int[][] matrizB) {
		
		int[][] matrizResultante = new int[matrizA.length][matrizB[0].length];
		
		for (int i = 0; i <  matrizA.length; i++) {
			
			for (int j = 0; j < matrizB[0].length; j++) {

				for (int k = 0; k < matrizA[0].length; k++) {
					matrizResultante[i][j] += matrizA[i][k] * matrizB[k][j];
				}										
			}			
		}
		return matrizResultante;
	}
	
}

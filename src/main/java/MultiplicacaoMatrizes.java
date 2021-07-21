import java.util.Iterator;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	private static Object[][] matrizA;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroLinhasA = entrada.nextInt();
		int numeroColunasA = entrada.nextInt();
		int numeroColunasB = entrada.nextInt();
		
		int[][] matrizA = new int[numeroLinhasA][numeroColunasA];
		int[][] matrizB = new int[numeroColunasA][numeroColunasB];
		
		for (Integer i = 0; i < numeroLinhasA; i++) {
			for (int j = 0; j < numeroColunasA; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		}
		
		for (Integer i = 0; i < numeroColunasA; i++) {
			for (int j = 0; j < numeroColunasB; j++) {
				matrizB[i][j] = entrada.nextInt();
			}
		}
		
		entrada.close();
		
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

	}
}

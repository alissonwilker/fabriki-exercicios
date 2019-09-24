import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int nLinhasA = entrada.nextInt();
		int nColunasA = entrada.nextInt();
		int nColunasB = entrada.nextInt();
		
		int[][] matrizA = new int[nLinhasA][nColunasA];
		int[][] matrizB = new int[nColunasA][nColunasB];
		int[][] matrizAxB = new int[nLinhasA][nColunasB];
		
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[0].length; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		}
		for(int i = 0; i < matrizB.length; i++) {
			for(int j = 0; j < matrizB[0].length; j++) {
				matrizB[i][j] = entrada.nextInt();
			}
		}
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizB[0].length; j++) {
				for(int k = 0; k < matrizB.length; k++) {
					matrizAxB[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}
		for(int i = 0; i < matrizAxB.length; i++) {
			for(int j = 0; j < matrizAxB[0].length; j++) {
				saida.println(matrizAxB[i][j]);
			}
		}
	}
}

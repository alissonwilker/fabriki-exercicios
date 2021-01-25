import java.util.Arrays;
import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[][]matrizA = new int[3][2];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		
		}

		int[][] matrizB = new int[2][3];
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				matrizB[i][j] = entrada.nextInt();

			}
		}
		
		int[][] matrizC = new int [3][3];
		for (int i = 0; i < matrizA.length ; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				for (int k =0; k < matrizC.length; k++) {
					matrizC [i][j] += matrizA[i][k] * matrizB [k][j];
				}
			}
		}
		
		
		System.out.println(Arrays.toString(matrizC));
		entrada.close();

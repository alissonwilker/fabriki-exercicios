import java.io.PrintStream;

import java.util.Scanner;

public class MultiplicacaoMatrizes {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int nlinhasmatriza = entrada.nextInt();
		int ncolunasmatriza = entrada.nextInt();
		int ncolunasmatrizb = entrada.nextInt();

		int[][] matriza = new int[nlinhasmatriza][ncolunasmatriza];

		for (int i = 0; i < nlinhasmatriza; i++) {
			for (int j = 0; j < ncolunasmatriza; j++) {
				matriza[i][j] = entrada.nextInt();

			}
		}
		

		int[][] matrizb = new int[ncolunasmatriza][ncolunasmatrizb];

		for (int i = 0; i < ncolunasmatriza; i++) {
			for (int j = 0; j < ncolunasmatrizb; j++) {
				matrizb[i][j] = entrada.nextInt();

			}
		}
		
		
		int[][] matrizc = new int[nlinhasmatriza][ncolunasmatrizb];
		
		for (int i = 0; i < matriza.length; i++ ) {
			for (int j = 0; j < matrizb[0].length; j++ ) {
				for (int k = 0; k < matrizb.length; k++ ) {
					matrizc[i][j] += matriza[i][k] * matrizb[k][j];
				}
					 
			}
		}
		
		
		for (int i = 0; i < matrizc.length; i++ ) {
			for (int j = 0; j < matrizc[0].length; j++ ) {
				saida.println(matrizc[i][j]);

			}
			
		}
		
		

	}

}

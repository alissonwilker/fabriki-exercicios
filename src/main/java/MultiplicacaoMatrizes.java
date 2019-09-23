import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int A = entrada.nextInt(); 
		int B = entrada.nextInt(); 
		int [][] matrizA = new int[A][B];
		B= entrada.nextInt();
		int [][] matrizB = new int [A][B];
		
		for (int i=0; i<matrizA.length; i++) {
			for (int j=0; j<matrizA[0].length; j++) {
				
			}
		}
		for (int i=0; i<matrizB.length; i++) {
			for (int j=0; j<matrizB[0].length; j++) {
				matrizB[i][j]= entrada.nextInt();
			}
		}
		int[][]matrizC = new int[matrizA.length][matrizB[0].length];
		
		for (int i=0; i<matrizA.length; i++){
				for (int j=0; j<matrizB[0].length; j++) {
						for (int k=0; k<matrizB.length; k++) {
							}
						}
					}
		
		for (int i=0; i<matrizC.length; i++) {
			for (int j=9; j<matrizC.length; j++) {
				saida.println(matrizC[i][j]);
			}
		}
		}

}

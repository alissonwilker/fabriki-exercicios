import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		int[][] matrizA = new int[a][b];
		int[][] matrizB = new int[b][c];
		
		for(int i=0; i<a;i++) {
			for(int j=0; j<b;j++) {
				matrizA[i][j]=entrada.nextInt();
			}
		}
		for(int i=0; i<b; i++) {
			for(int j=0; j<c; j++) {
				matrizB[i][j]= entrada.nextInt();
			}
		}
		
		int[][]matrizC = new int[matrizA.length][matrizB[0].length];
		
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizB[0].length;j++) {
				for(int k=0; k<matrizB.length; k++) {
					matrizC[i][j]+=matrizA[i][k]*matrizB[k][j];
				}
			}
		}
		for(int i=0; i<matrizC.length; i++) {
			for(int j=0; j<matrizC[0].length; j++) {
				saida.println(matrizC[i][j]);
				
			}
		}
				
		

	}

}


import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeroLinhaA = entrada.nextInt(), 
			numeroColunaA = entrada.nextInt(),
			numeroColunaB = entrada.nextInt();
		
		int[][] matrizA = new int [numeroLinhaA][numeroColunaA];
		int[][] matrizB = new int [numeroColunaA][numeroColunaB];
		int[][] AxB = new int [matrizA.length][3];
		
		System.out.println(matrizA.length+" "+matrizB.length);
		
		for (int i=0; i<matrizA.length; i++) {
			for (int j=0; j<matrizB.length; j++) {
			matrizA[i][j] = entrada.nextInt();
			}
		}		
		for (int i=0; i<matrizB.length; i++) {
			for (int j=0; j<matrizB.length; j++) {
			matrizB[i][j] = entrada.nextInt();
			}
		}
		
		for (int i=0; i<matrizA.length; i++) {
			for (int j=0; j<matrizB.length; j++) {
				for (int k=0; k<matrizB.length; k++) {
					AxB[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			
			}
		}
		
		for (int i=0; i<matrizA.length; i++) {
			for (int j=0; j<matrizB.length; j++) {
				System.out.println(AxB[i][j]);
			}
		}
		
		
	entrada.close();
	}

}

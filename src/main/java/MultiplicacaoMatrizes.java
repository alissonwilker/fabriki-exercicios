import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int linA = entrada.nextInt();
		int colA = entrada.nextInt();
		int colB = entrada.nextInt();
		
		int matrizA[][] = new int[linA][colA];
		int matrizB[][] = new int[colA][colB];
		
		for (int i = 0; i < linA; i++) {
			  for (int j = 0; j < colA; j++) {
				  matrizA[i][j] = entrada.nextInt();
				  }
			  }
		for (int i = 0; i < colA; i++) {
			  for (int j = 0; j < colB; j++) {
				  matrizB[i][j] = entrada.nextInt();
			  }			 					
		}
		
		int[][] matrizC = new int[matrizA.length][matrizB[0].length];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				for (int k = 0; k < matrizB.length; k++) {
					matrizC[i][j] += matrizA[i][k] * matrizB[k][j]; }}}
		
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[0].length; j++) {
				System.out.println(matrizC[i][j]); }
				}
}
}

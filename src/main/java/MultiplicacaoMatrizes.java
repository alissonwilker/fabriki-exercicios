import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [][]matrizA = new int[2][2];
		int [][]matrizB = new int[2][2];
		int [][]matrizC = new int[matrizA.length][matrizB[0].length];
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				matrizA[i][j] = entrada.nextInt(); 
			}
		}
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				matrizB[i][j] = entrada.nextInt(); 
			}
		}
		
		if (matrizA[0].length == matrizB.length) {
			for (int i = 0; i < 2; i++) {	
				for (int j = 0; j < 2; j++) {		
					for (int k = 0; k < 2; k++) {	
						matrizC[i][j] += matrizA[i][k] * matrizB[k][j];}}}
					
			for (int i = 0; i < 2; i++) {	
				for (int j = 0; j < 2; j++) {	
					System.out.println(matrizC[i][j] + " ");
				}
			}
		}
		
	}

}

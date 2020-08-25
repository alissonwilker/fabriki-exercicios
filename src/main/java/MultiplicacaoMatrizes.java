import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int linhasA = scanner.nextInt();
		int colunasA = scanner.nextInt();
		int colunasB = scanner.nextInt();
		int matrizA[][] = new int[linhasA][colunasA];
		int matrizB[][] = new int [colunasA][colunasB];
		int resultado[][] = new int [matrizA.length][matrizB[0].length];
		
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunasB; j++) {
				matrizA[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < colunasA; i++) {
			for (int j = 0; j < colunasB; j++) {
				matrizB[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				for (int k = 0; k < colunasA; k++) {
				resultado[i][j] += matrizA[i][k] * matrizB[k][j];
				}
				
			}
		}
		
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunasB; j++) {
				System.out.println(resultado[i][j]);
			}
			
		}
		
		
	}

}

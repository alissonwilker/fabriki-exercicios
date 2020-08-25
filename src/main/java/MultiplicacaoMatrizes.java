import java.util.Scanner;

public class MultiplicacaoMatrizes{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int linhaA = sc.nextInt();
		int colunaA = sc.nextInt();
		int colunaB = sc.nextInt();

		int matrizA[][] = new int[linhaA][colunaA];
		int matrizB[][] = new int[colunaA][colunaB];
		

		for (int i = 0; i < linhaA; i++) {
			for (int j = 0; j < colunaA; j++) {
				matrizA[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < colunaA; i++) {
			for (int j = 0; j < colunaB; j++) {
				matrizB[i][j] = sc.nextInt();
			}
		}

		sc.close();
		
		int matrizAxB[][] = new int[matrizA.length][matrizB[0].length];
		
		for (int i = 0; i < linhaA; i++) {
			for (int j = 0; j < colunaA; j++) {
				for (int h = 0; h < matrizB.length; h++) {
					matrizAxB[i][j] += matrizA[i][h] * matrizB[h][j];
				}
			}
		}
		
		for (int i = 0; i < matrizAxB.length; i++) {
			for (int j = 0; j < matrizAxB[0].length; j++) {
			   System.out.println(matrizAxB[i][j]); 
			 }
		}

	}

}

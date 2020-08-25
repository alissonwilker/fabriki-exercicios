import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int linhaA = sc.nextInt();
		int colunaA = sc.nextInt();
		int colunaB = sc.nextInt();

		int A[][] = new int[linhaA][colunaA];
		int B[][] = new int[colunaA][colunaB];
		

		for (int i = 0; i < linhaA; i++) {
			for (int j = 0; j < colunaA; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < colunaA; i++) {
			for (int j = 0; j < colunaB; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		int matrizAxB[][] = new int[A.length][B[0].length];
		
		for (int i = 0; i < matrizAxB.length; i++) {
			for (int j = 0; j < matrizAxB[0].length; j++) {
				for (int h = 0; h < B.length; h++) {
					matrizAxB[i][j] += A[i][h] * B[h][j];
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

import java.util.Scanner;

public class MultiplicacaoMatrizes {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 int linhaA = entrada.nextInt();
		 int colunaA = entrada.nextInt();
		 int colunaB = entrada.nextInt();
		 int linhaB = colunaA;
		 
		 int [][] matrizA = new int[linhaA][colunaB];
		 int [][] matrizB = new int[linhaA][colunaB];
		 int [][] matrizC= new int[linhaA][colunaB];
		 
		 for (int i = 0; i < linhaA; i++)
				for ( int j = 0; j < colunaA; j++) {
					matrizA[i][j] = entrada.nextInt();
				}
		 
		 for (int i = 0; i < linhaB; i++)
				for ( int j = 0; j < linhaB; j++) {
					matrizB[i][j] = entrada.nextInt();
				}
		 

			for (int i = 0; i < linhaA; i++) {
				for (int j = 0; j < colunaB; j++) {

					for (int k = 0; k < matrizB.length; k++) {
						matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
					}

				}

			}
		 
		for (int i = 0; i < linhaA; i++) {

			for (int j = 0; j <colunaB; j++) {

				System.out.println(matrizC[i][j]);
			}

		}

	}

}

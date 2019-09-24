import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[]args) {
		int numLinhasA = entrada.nextInt();
		int numColA = entrada.nextInt();
		int numColB = entrada.nextInt();



		int[] [] matrizA= new int[numLinhasA][numColA];
		int[] [] matrizB=  new int[numColA][numColB];
		int[] [] matrizAxB = new int [matrizA.length][matrizB[0].length];


		for (int i = 0; i < numLinhasA; i++) {
			for (int j = 0; j < numColA; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < numColA; i++) {
			for (int j = 0; j < numColB; j++) {
				matrizB[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				for (int k = 0; k < matrizB.length; k++) {
					matrizAxB[i][j] += matrizA[i][k] * matrizB[k][j];

				}
			}

		}

		for (int i = 0; i < matrizAxB.length; i++) {
			for (int j = 0; j < matrizAxB[0].length; j++) {
				saida.println(matrizAxB[i][j]);
			}
		}
	}
}


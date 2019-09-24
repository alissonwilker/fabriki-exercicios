import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {

	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int linhaA = entrada.nextInt();
		int colunaA = entrada.nextInt();
		int colunaB = entrada.nextInt();
		int linhaB = entrada.nextInt();

		int[][] a = new int[linhaA][colunaA];
		int[][] b = new int[linhaB][colunaB];
		int[][] c = new int[linhaA][colunaB];

		for (int i = 0; i < linhaA; i++) {
			for (int j = 0; j < colunaA; j++) {
				a[i][j] = entrada.nextInt();
			}
		}
		for (int i = 0; i < linhaB; i++) {
			for (int j = 0; j < colunaB; j++) {
				b[i][j] = entrada.nextInt();
			}
		}
		for (int i = 0; i < linhaB; i++) {
			for (int j = 0; j < colunaB; j++) {
				for (int k = 0; j < colunaB; k++)
					c[i][j] += a[i][k] * b[k][j];
			}
		}

		for (int i = 0; 1 < linhaB; i++) {
			for (int j = 0; j < colunaB; j++) {
				saida.println(+c[i][j]);
			}
		}
	}
}

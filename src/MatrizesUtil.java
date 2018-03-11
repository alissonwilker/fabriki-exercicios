import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrizesUtil {
	private static Scanner scanner;

	public static void imprimirMatriz(int[][] matriz, String nomeDaMatriz) {
		System.out.println(nomeDaMatriz + " = ");
		System.out.print("{ ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("{");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(" " + matriz[i][j] + ",");
			}
			System.out.print("}, ");
		}
		System.out.println("}");
	}

	public static int[][] criarMatriz(int linhas, int colunas) {
		return new int[linhas][colunas];
	}

	public static void preencherMatriz(int[][] matriz, String nomeDaMatriz) {
		System.out.println("Preencha os valores da " + nomeDaMatriz + ".");
		for (int a = 0; a < matriz.length; a++) {
			for (int b = 0; b < matriz[0].length; b++) {
				System.out.print("Digite o valor da posição [" + a + "][" + b + "]: ");
				matriz[a][b] = scanner.nextInt();
			}
		}
	}

	public static void preencherEImprimirMatriz(int[][] matriz, String nomeDaMatriz) {
		preencherMatriz(matriz, nomeDaMatriz);
		imprimirMatriz(matriz, nomeDaMatriz);
	}

	public static int lerNumeroDeLinhasOuColunasDaMatriz(Matriz linhasOuColunas, String nomeMatriz) {
		int linhasA = 0;
		while (linhasA <= 0 || linhasA > Integer.MAX_VALUE) {
			System.out.print("Digite a qtde. de " + linhasOuColunas + " da " + nomeMatriz + " (maior do que 0):  ");
			try {
				scanner = new Scanner(System.in);
				linhasA = scanner.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Número inválido!");
			}
		}
		return linhasA;
	}
}

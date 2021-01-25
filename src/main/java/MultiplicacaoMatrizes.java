import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int linha_A, coluna_A;
		int coluna_B;
		
		linha_A = entrada.nextInt();
		coluna_A = entrada.nextInt();
		coluna_B = entrada.nextInt();
		
		int[][] matriz_A = new int [linha_A][coluna_A];
		
		for (int i = 0; i < linha_A; i++) {
			for (int j = 0; j < coluna_A; j++) {
				matriz_A [i][j] = entrada.nextInt();
			}
		}
		
		int[][] matriz_B = new int [linha_A][coluna_B];
		
		for (int i = 0; i < linha_A; i++) {
			for (int j = 0; j < coluna_B; j++) {
				matriz_B [i][j] = entrada.nextInt();
			}
		}
		
		int[][] matriz_resultante = new int[linha_A][coluna_B];
		
		for (int i = 0; i < linha_A; i++) {	
			for (int j = 0; j < coluna_B; j++) {
				for (int k = 0; k < linha_A;k++) {
					matriz_resultante [i][j] += matriz_A [i][k] * matriz_B [k][j];
				}
			}
		}
		
		for (int i = 0; i < linha_A; i++) {
			for (int j = 0; j < coluna_B; j++) {
				System.out.println(matriz_resultante[i][j]);
			}
		}		
	}

}

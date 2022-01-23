import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		número de linhas da matriz A
		int linhasA = 0;
//		número de colunas da matriz A
		int colunasA = 0;
// 		número de linhas da matriz B
		int linhasB = 0;
//		número de colunas da matriz B
		int colunasB = 0;
		
		Scanner teclado = new Scanner(System.in);
		linhasA = teclado.nextInt();
		colunasA = teclado.nextInt();
		linhasB = colunasA;
		colunasB = teclado.nextInt();
		
		int[][] matrizA = new int[linhasA][colunasA];
		int[][] matrizB = new int[linhasB][colunasB];
		int[][] matrizC = new int[linhasA][colunasB];

		for(int l=0; l < linhasA; l++) {
			for(int c=0; c < colunasA; c++) {
				matrizA[l][c] = teclado.nextInt();
			}
		}
		//---
		for(int l=0; l < linhasB; l++) {
			for(int c=0; c < colunasB; c++) {
				matrizB[l][c] = teclado.nextInt();
			}
		}
		teclado.close();
		//-----Multiplicaao de Matriz
		for(int l=0; l < linhasA; l++) {
			for(int c=0; c < colunasB; c++) {
				matrizC[l][c] = 0;
				for(int m=0; m < linhasB; m++) {
					
						matrizC[l][c] += matrizA[l][m] * matrizB[m][c]; 
						
				}
				System.out.println(matrizC[l][c]);
			}
		}
		//-----
	}

}

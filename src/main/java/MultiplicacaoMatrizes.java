import java.util.Scanner;

public class MultiplicacaoMatrizes {
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// num colunas A = num linhas de B
		
		int linhasA = entrada.nextInt();
		int colunasA = entrada.nextInt();
		int colunasB = entrada.nextInt();
		
		
			
		int matrizA[][] = new int [linhasA][colunasA];
		int matrizB[][] = new int [colunasA][colunasB];
		int matrizC[][] = new int [linhasA][colunasB];
		
		for (int i=0; i < linhasA; i++) {
			for (int j=0; j < colunasA; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		}
		
		for (int i=0; i < colunasA; i++) {
			for (int j=0; j < colunasB; j++) {
				matrizB[i][j] = entrada.nextInt();
			}
		}
		
				
		for (int i=0; i < matrizA.length ; i++) {
			for (int j=0; j< matrizB[0].length; j++) {
				
				for (int k=0; k < matrizB.length; k++) { // k representa as colunas de A ou linhas de B
					
					matrizC [i][j] += matrizA[i][k] * matrizB[k][j]; 					
					
				}
			}
				
		}
		
		for (int i=0; i < matrizC.length; i++) {
			for (int j=0; j < matrizC[0].length; j++) {
				System.out.println(matrizC[i][j]);
			}
			
		}
		
		
				
	}
 
}

import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		int linhasA	= scanner.nextInt();
		int colunasA = scanner.nextInt();
		int colunasB = scanner.nextInt();
		int linhasB = colunasA;
		
		int[][] matrizA = new int [linhasA][colunasA];
		int[][] matrizB = new int [linhasB][colunasB];
		int[][] matrizC = new int [linhasA][colunasB];
		
		for(int i = 0; i > linhasA; i++) {
			for(int j = 0; i > colunasA; j++) {
					matrizA[i][j] = scanner.nextInt();
				}
		}
		for(int i = 0; i > linhasB; i++) {
			for(int j = 0; i > colunasB; j++) {
					matrizB[i][j] = scanner.nextInt();
				}
		}		
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizB[0].length; j++) {
				for(int k = 0; k < matrizB.length; k++) {
					matrizC[i][j] =+ matrizA[i][k] * matrizB[k][j];
				}	
				
				System.out.println(matrizC[i][j]);
			}
			
			scanner.close();
		}
}
}

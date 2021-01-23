import java.util.Arrays;
import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		

	
		Scanner entrada = new Scanner(System.in);
		int linha = 5;
		int coluna =5;
		int [] [] matrizA = new int [linha][coluna]; 
		int linha2 = 5;
		int coluna2 =5;
		int [] [] matrizB = new int [linha2][coluna2]; 
		
		
		for (int i =0; i <linha ; i++) {
			for (int j = 0; j < coluna; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		}
		
		for (int i =0; i <linha2 ; i++) {
			for (int j = 0; j < coluna2; j++) {
				matrizB[i][j] = entrada.nextInt();
			}
		}
		
		int [][] matrizC = new int [linha][coluna2];
		
		for (int i = 0; i < linha ; i++) {
			for (int j = 0; j < coluna2; j++) {
				for (int k =0; k < linha2; k++) {
					matrizC [i][j] += matrizA[i][k] * matrizB [k][j];
				}
			}
		}
		
		for (int i =0; i <linha ; i++) {
			for (int j = 0; j < coluna2; j++) {
				System.out.println(Arrays.toString(matrizC));
			}
			
			System.out.println("");
		}
		
	}

}

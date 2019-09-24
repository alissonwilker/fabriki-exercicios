import java.util.Scanner;
import java.io.PrintStream;

public class MultiplicacaoMatrizes {

	private static PrintStream saida = System.out;
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			
			int linhaA =  entrada.nextInt();
			
			int colunaA =  entrada.nextInt();
			
			
			int colunaB =  entrada.nextInt();
			int linhaB = colunaA;
		
		int[][] a = new int[linhaA][colunaA];
		int[][] b = new int[linhaB][colunaB];
		int[][] c = new int[linhaA][colunaB];
		
	
		for(int i = 0; i < linhaA; i++) {
			for(int j = 0; j< colunaA; j++) {
				a[i][j] = entrada.nextInt();
			}
		}
		
		
		for(int i = 0; i < linhaB; i++) {
			for(int j = 0; j< colunaB; j++) {
				b[i][j] = entrada.nextInt();
			}
		}
		
		for(int i = 0; i < linhaA; i++) {
			for(int j = 0; j < colunaB; j++) {
				for(int k = 0; k < linhaB; k++){
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		
		for(int i = 0; i < linhaA; i++) {  
			for(int j = 0; j< colunaB; j++) {
				saida.println(+c[i][j]);  
			}
		}
		

	}

}

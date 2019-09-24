import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	   private static Scanner entrada = new Scanner(System.in);
	    private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("número de linhas da matriz A");
		int linhaA = entrada.nextInt();
		System.out.println("número de colunas da matriz A");
		int colunaA = entrada.nextInt();
		System.out.println("número de colunas da matriz B");
		int colunaB = entrada.nextInt();
		
		
		int[][] A = new int[linhaA][colunaA];
		int[][] B = new int[colunaA][colunaB] ;
		int[][] C = new int[A.length][B[0].length];
		

		
		for(int i=0;i< linhaA ;i++) {
			for(int j=0;j< colunaB;j++) {

				int n = entrada.nextInt();
				
				A[i][j]= n;
				
			}
		}
		
		for(int i=0;i< colunaA ;i++) {
			for(int j=0;j< colunaB;j++) {

				int n = entrada.nextInt();
				
				B[i][j]= n;
				
			}
		}
		
		
		
	
		for(int i=0;i<A.length;i++){//ate 2
			for(int j=0;j<B[0].length;j++) {//ate 1
				for (int k = 0; k < A[0].length; k++) {
					
					C[i][j] += (A[i][k] * B[k][j]);
				
				}}}
		
		
		
		
		for(int i=0;i< C.length ;i++) {
			for(int j=0;j< C[0].length;j++) {
				saida.println(C[i][j]);
			}
		}

	}

}

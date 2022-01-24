import java.util.Scanner;

public class MultiplicacaoMatrizes {
	
	public static void main(String[] args) {
		
		
try (Scanner leitor = new Scanner(System.in)) {
	int linhaA=0;
	int colunaA=0;
	int colunaB=0;
	
	System.out.println("Entre quantidade de linhas matriz A");

	linhaA=leitor.nextInt();
	
	System.out.println("Entre quantidade de colunas matriz A");

	colunaA=leitor.nextInt();

	System.out.println("Entre quantidade de coluna matriz B");

	colunaB=leitor.nextInt();
			
	
	int matrizA[][] = new int[linhaA][colunaA];
	int matrizB[][] = new int[colunaA][colunaB];
	//int matrizC[][] = new int[linhaA][colunaB];
	
	
		
		for (int i = 0; i < linhaA; i++) {
			for (int j = 0; j < colunaA; j++ ) {
				System.out.println("entre com a posição matriz A:" +matrizA[i][j]);
				matrizA[i][j] = leitor.nextInt();
				
			}
		}
		
		for (int i = 0; i < colunaA; i++) {
			for (int j=0; j < colunaB; j++ ) {
				System.out.println("entre com a posição matriz B:  "+matrizB[i][j]);
				matrizB[i][j] = leitor.nextInt();
				
			}
		}
	
		
		int[][] matrizC = new int[matrizA.length][matrizB[0].length];
	
		for (int i = 0; i < matrizA.length; i++) {
		
		  for (int j = 0; j < matrizB[0].length; j++) {
		  
		    for (int k = 0; k < matrizB.length; k++) {
		    
		      matrizC[i][j] += matrizA[i][k] * matrizB[k][j]; }}}
		      
		System.out.print("matrizC = { ");
		
		for (int i = 0; i < matrizC.length; i++) {
		  System.out.print("{");
		  for (int j = 0; j < matrizC[0].length; j++) {
		    System.out.print(" " + matrizC[i][j] + ","); }
		  System.out.print("}, "); }
		System.out.println("}");


		
	}

}}

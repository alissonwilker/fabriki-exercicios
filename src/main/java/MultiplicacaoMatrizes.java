import java.util.Scanner;

public class MultiplicacaoMatrizes{
	public static void main(String[] args) {

		Scanner lerNumeros = new Scanner(System.in);
		int linhaA = lerNumeros.nextInt();
		int colunaA = lerNumeros.nextInt();
		int colunaB = lerNumeros.nextInt();
		
		int matrizA[][] = new int[linhaA][colunaA];
		int matrizB[][] = new int[colunaA][colunaB];
		int matrizC[][] = new int[linhaA][colunaB];
		
		for(int i=0; i<linhaA;i++){
			for(int j=0; j<colunaA; j++){
				matrizA[i][j] = lerNumeros.nextInt();
			}
		}
		
		for(int i=0; i<colunaA;i++){
			for(int j=0; j<colunaB; j++){
				matrizB[i][j] = lerNumeros.nextInt();
			}
		}
		
		
		for(int i=0; i<linhaA;i++) {
			for(int j=0; j<colunaB; j++){
			    for (int k = 0; k < matrizB.length ; k++) {
			    	
				      matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
				      
			    }
			}
		}
		
		
		for (int i = 0; i < matrizC.length; i++) {
		  for (int j = 0; j < matrizC[0].length; j++) {
		    System.out.print(matrizC[i][j]+"\n"); }
}
		
		
	}
}

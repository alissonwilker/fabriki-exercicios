import java.util.Scanner;

public class MultiplicacaoMatrizes{

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
							
		int linhaA= scanner.nextInt();
		int colunaA= scanner.nextInt();
		
		int [][] MatrizA = new int[linhaA][colunaA];
		
		 
		
		int colunaB= scanner.nextInt();
		
		int [][] MatrizB = new int[colunaA][colunaB];
		
	
		for (int i=0; i<linhaA; i++) {
			for (int j=0; j<colunaA; j++) {
				MatrizA[i][j] = scanner.nextInt();
			}
		}
	
		for (int i=0; i<colunaA; i++) {
			for (int j=0; j<colunaB; j++) {
				 MatrizB[i][j] = scanner.nextInt();
			}
		}

		for (int i=0; i<colunaA; i++) {
			for (int j=0; j<colunaA; j++) {
			
			}
			
		}
		
		for (int i=0; i<colunaA; i++) {
			for (int j=0; j<colunaB; j++) {
									
			}
			
		}
		
			int [][] matrizC = new int[linhaA][colunaB];
			for (int i = 0; i<linhaA; i++) {
				for (int j = 0; j<colunaB; j++) {
					for (int k = 0; k<colunaA; k++) {
						
						matrizC[i][j] += MatrizA[i][k] * MatrizB[k][j];
						
				}
				
			}
			
		}
		
			for (int i = 0; i < matrizC.length; i++) {
			  
			  for (int j = 0; j < matrizC[0].length; j++) {
			    System.out.println( matrizC[i][j]); }
			 
		}				
			
	}	
		
}

import java.util.Scanner;

public class MultiplicacaoMatrizes{

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		for (int c=0; c<2; c++){
		
		
		
		int linha= scanner.nextInt();
		int coluna= scanner.nextInt();
		
		int [][] MatrizA = new int[linha][coluna];
		
		 
		int linha2= 2;
		int coluna2= scanner.nextInt();
		
		int [][] MatrizB = new int[linha2][coluna2];
		
	
		for (int i=0; i<linha; i++) {
			for (int j=0; j<coluna; j++) {
				MatrizA[i][j] = scanner.nextInt();
			}
		}
	
		System.out.println("");
		for (int i=0; i<linha2; i++) {
			for (int j=0; j<coluna2; j++) {
				 MatrizB[i][j] = scanner.nextInt();
			}
		}

		for (int i=0; i<linha; i++) {
			for (int j=0; j<coluna; j++) {
			
				
				
			}
			
			System.out.println("");
		}
		
		System.out.println("");
	
		for (int i=0; i<linha2; i++) {
			for (int j=0; j<coluna2; j++) {
			
				
				
			}
			
			System.out.println("");
		}
		
	
			
			int [][] matrizC = new int[linha][coluna2];
			for (int i = 0; i<linha; i++) {
				for (int j = 0; j<coluna2; j++) {
					for (int k = 0; k<linha2; k++) {
						
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
}

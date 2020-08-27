import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
	
		
		for (int c=0; c<2; c++){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero de linhas matriz A\n");
		int linha= scanner.nextInt();
		System.out.print("Digite o numero de colunas matriz A\n");
		int coluna= scanner.nextInt();
		
		int [][] MatrizA = new int[linha][coluna];
		
		 
		int linha2= 2;
		System.out.print("Digite o numero de colunas matriz B\n");
		int coluna2= scanner.nextInt();
		
		int [][] MatrizB = new int[linha2][coluna2];
		
	
		for (int i=0; i<linha; i++) {
			for (int j=0; j<coluna; j++) {
				MatrizA[i][j] = scanner.nextInt();
			}
		}
	
		System.out.println("\n");
		for (int i=0; i<linha2; i++) {
			for (int j=0; j<coluna2; j++) {
				 MatrizB[i][j] = scanner.nextInt();
			}
		}

		for (int i=0; i<linha; i++) {
			for (int j=0; j<coluna; j++) {
			
				System.out.print(MatrizA[i][j] +" \n");
				
			}
			
			System.out.println("\n");
		}
		
		System.out.println("\n");
	
		for (int i=0; i<linha2; i++) {
			for (int j=0; j<coluna2; j++) {
			
				System.out.print(MatrizB[i][j] +"\n");
				
			}
			
			System.out.println("\n");
		}
		
	
			
			int [][] matrizC = new int[linha][coluna2];
			for (int i = 0; i<linha; i++) {
				for (int j = 0; j<coluna2; j++) {
					for (int k = 0; k<linha2; k++) {
						
						matrizC[i][j] += MatrizA[i][k] * MatrizB[k][j];
						
				}
				
			}
			
		}
			
			System.out.print("matrizC = { \n");
			for (int i = 0; i < matrizC.length; i++) {
			  System.out.print("{\n");
			  for (int j = 0; j < matrizC[0].length; j++) {
			    System.out.print("\n " + matrizC[i][j] + ",\n"); }
			  System.out.print("},\n "); }
			System.out.print("}\n");
			
			System.out.println("\n");
		}				
		
	}	
	
}

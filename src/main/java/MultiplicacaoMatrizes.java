import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
	
		//int matrizA[][] = new int[][] { { 2, 3 }, { 1, 0 }, { 4, 5 } };
		//int matrizB[][] = { { 3, 1 }, { 2, 4 } };
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero de linhas matriz A");
		int linha= scanner.nextInt();
		System.out.print("Digite o numero de colunas matriz A");
		int coluna= scanner.nextInt();
		
		int [][] MatrizA = new int[linha][coluna];
		
		 
		int linha2= 2;
		System.out.print("Digite o numero de colunas matriz B");
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
			
				System.out.print(MatrizA[i][j] +" ");
				
			}
			
			System.out.println("");
		}
		
		System.out.println("");
	
		for (int i=0; i<linha2; i++) {
			for (int j=0; j<coluna2; j++) {
			
				System.out.print(MatrizB[i][j] +" ");
				
			}
			
			System.out.println("");
		}
		
		if(MatrizA[0].length >= MatrizB.length) {
			
			int [][] matrizC = new int[linha][coluna2];
			for (int i = 0; i<linha; i++) {
				for (int j = 0; j<coluna2; j++) {
					for (int k = 0; k<linha2; k++) {
						
						matrizC[i][j] += MatrizA[i][k] * MatrizB[k][j];
						
				}
				
			}
			
		}
			
			System.out.print("matrizC = { ");
			for (int i = 0; i < matrizC.length; i++) {
			  System.out.print("{");
			  for (int j = 0; j < matrizC[0].length; j++) {
			    System.out.print(" " + matrizC[i][j] + ","); }
			  System.out.print("}, "); }
			System.out.println("}");
				}
	
	
	
			else {
			
				System.out.print("Multiplicaao não é possivel");
			}
				
		
	}	
	
}

import java.util.Scanner;

public class MultiplicacaoMatrizes	 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);		
		
		int linhasMatrizA = scan.nextInt();
		int colunasMatrizA = scan.nextInt();
		int colunasMatrizB = scan.nextInt();		
		
		int[][] matrizA = new int[linhasMatrizA][colunasMatrizA];
		int[][] matrizB = new int [colunasMatrizA][colunasMatrizB];
		int[][] matrizC = new int [linhasMatrizA][colunasMatrizB];
		
		for (int i = 0; i < linhasMatrizA; i++) {						
			for (int j = 0; j < colunasMatrizA; j++) {				
					matrizA[i][j] = scan.nextInt();				
			}					
		}
			
		for (int i = 0; i < colunasMatrizA; i++) {						
			for (int j = 0; j < colunasMatrizB; j++) {				
					matrizB[i][j] = scan.nextInt();
				}			
			}
		
		for(int i =0; i<matrizA.length;i++) {
			for(int j =0; j<matrizA[i].length;j++) {
				for(int k=0; k<matrizB.length;k++) {
					matrizC[i][j]+= matrizA[i][k]*matrizB[k][j];
				}
				System.out.println(matrizC[i][j]);
			}	
		}	
	}
}

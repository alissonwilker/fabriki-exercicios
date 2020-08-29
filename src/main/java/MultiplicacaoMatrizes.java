import java.util.Scanner;
public class MultiplicacaoMatrizes 
{
	public static void main(String[] args) {
		Scanner Scanner = new Scanner (System.in);
		
		int linhasA = Scanner.nextInt() ;
		int colunaA = Scanner.nextInt() ;
		int colunaB = Scanner.nextInt() ;
		
		int matrizA [][] = new int [linhasA] [colunaA];
		
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunaA; j++) {
				
			matrizA [i][j] = Scanner.nextInt();
			}
		}
		
		int matrizB[][] = new int [linhasA][colunaB];
		
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunaB; j++) {
				
			matrizB [i][j] = Scanner.nextInt();
			}
		}
		
		int [][] matrizC = new int [matrizA.length][matrizB[0].length];
	
		for (int i = 0; i < matrizA.length; i++) {
			  for (int j = 0; j < matrizB[0].length; j++) {
			    for (int k = 0; k < matrizB.length; k++) {
				   matrizC[i][j] += matrizA[i][k] * matrizB[k][j];   
			    } 
			}
		}	      
			         
		for (int i = 0; i <matrizC.length; i++)	 {
			for(int j = 0; j < matrizC[0].length; j++) {
				System.out.println(matrizC[i][j]);
			
		    }   
		}
			    
	}
}


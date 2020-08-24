import java.util.Scanner; 

public class MultiplicacaoMatrizes {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		int linhasA = scanner.nextInt();
		int colunasA = scanner.nextInt();
		//int linhasB = scanner.nextInt();
		int colunasB = scanner.nextInt();
						
		    int matrizA [][] = new int[linhasA][colunasA];
		    		   
		    for (int i = 0; i < linhasA; i++) {
		      for (int j = 0; j < colunasA; j++) {
		    	  
		    	matrizA [i][j] =  scanner.nextInt();
		    	
		      }
		      
		    }
		     
			
		    int matrizB [][] = new int[colunasA][colunasB];
		    		    
		    for (int i = 0; i < colunasA; i++) {
		      for (int j = 0; j < colunasB; j++) {
		    	  
		    	matrizB [i][j] =  scanner.nextInt();
		      }
		    }
	
		
		int[][] matrizC = new int[matrizA.length][matrizB[0].length];
		
		
		for (int i = 0; i < matrizA.length; i++) {
		  for (int j = 0; j < matrizB[0].length; j++) {
		    for (int k = 0; k < matrizB.length; k++) {
		      matrizC[i][j] += matrizA[i][k] * matrizB[k][j]; }}}
		
		
		for (int i = 0; i < matrizC.length; i++) {
			  for (int j = 0; j < matrizC[0].length; j++) {
		    System.out.println( matrizC[i][j] ); 
		    }		
		}
	}
}
	

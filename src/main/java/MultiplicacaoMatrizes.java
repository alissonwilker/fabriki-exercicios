import java.util.Scanner;

public class MultiplicacaoMatrizes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
      int a,b,c;
      a = entrada.nextInt();
      b = entrada.nextInt();
      c = entrada.nextInt();
      
      int matrizA[][] = new int[a][b];
      int matrizB[][] = new int[b][c];
      
      for(int linhas=0;linhas<matrizA.length;linhas++){
    	  for(int cols=0;cols<matrizA[0].length;cols++){
    	  matrizA[linhas][cols]=entrada.nextInt();
    	  }
    	  }
      for(int linhas=0;linhas<matrizB.length;linhas++){
    	  for(int cols=0;cols<matrizB[0].length;cols++){
    	  matrizB[linhas][cols]=entrada.nextInt();
    	  }
    	  } 
      
     int [][] matrizC = new int[a][c];
     
     for (int i = 0; i < matrizA.length; i++) {
    	  for (int j = 0; j < matrizB[0].length; j++) {
    	    for (int k = 0; k < matrizB.length; k++) {
    	      matrizC[i][j] += matrizA[i][k] * matrizB[k][j]; }}}

     
      
      for (int l = 0; l < matrizC.length; l++)  {     
    	  for (int x = 0; x < matrizC[0].length; x++)     {   
    		  System.out.println(matrizC[l][x]) ; 
    
  
    
	

    	}
      }
	}
}

import java.util.Scanner;
public class MultiplicacaoMatrizes {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int a,b,c=0;
		 a = entrada.nextInt();
	     b = entrada.nextInt();
	     c = entrada.nextInt();
		int[][] matrizA = new int[a][b];
		int[][] matrizB = new int[b][c];
         for(int linha=0 ; linha < a ; linha++){
          for(int coluna = 0; coluna < b ; coluna ++){
        	 matrizA[linha][coluna]=entrada.nextInt();
       }       }
              for(int linhab=0 ; linhab < b ; linhab++){
                for(int colunab = 0; colunab < c ; colunab ++){
             matrizB[linhab][colunab]=entrada.nextInt();
           }
                }
              entrada.close();
           int[][] matrizAXB = new int[a][c];
           for ( int i = 0; i< matrizAXB.length; i ++ ){
    		for ( int j = 0; j< matrizAXB[0].length; j ++ ) {
    			for ( int k = 0; k< 2; k ++ ) {
    				matrizAXB[i][j] += matrizA[i][k]*matrizB[k][j];
    	}	  	}    	}
           for(int linha3=0 ; linha3 < a ; linha3++){
               for(int coluna3 = 0; coluna3 < c ; coluna3 ++){
                   System.out.println(matrizAXB[linha3][coluna3]);
               }}
}}

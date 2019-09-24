import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	  public static void main(String[] args) {
		int linha = entrada.nextInt();
		int colunaA = entrada.nextInt();
		int colunaB = entrada.nextInt();
		  
	    int [][] a = new int [linha][colunaA];
	    int [][] b = new int [colunaB][colunaB];
	    int [][] c = new int[a.length][b.length];

	    for (int n = 0; n < linha; n++) {
	    	for (int h = 0; h < colunaA; h++) {
		    	a[n][h] = entrada.nextInt();
		    }
	    }
	    
	    for (int t = 0; t < colunaB; t++) {
	    	for (int w = 0; w < colunaB; w++) {
	    		b[t][w] = entrada.nextInt();
		    }
	    }
	    
	    for(int i = 0; i < a.length; i++) {
	      for (int p = 0; p < b.length; p++) {
	        for (int q = 0; q < b.length; q++) {
	          c[i][p] += a[i][q] * b[q][p];
	        }
	        saida.println(c[i][p]);
	      }
	    }
	  }
	}

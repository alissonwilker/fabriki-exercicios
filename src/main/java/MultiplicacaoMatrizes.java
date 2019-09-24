import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int [] [] matrizA = new int[a] [b];
		int [] [] matrizB = new int[b] [c];
		int [] [] matrizAxB = new int[matrizA.length] [matrizB[0].length];


		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				matrizA [i][j] = entrada.nextInt();
				
	}
}
		for (int i = 0; i < b; i++) {
		for (int k = 0; k < c; k++) {
			matrizB [i] [k] = entrada.nextInt();
		}
		

}
		for(int linhas = 0 ; linhas < matrizAxB.length; linhas++) {
			for (int colunas = 0; colunas < matrizB.length; colunas++){
				 for (int multiplicacao = 0; multiplicacao < matrizB.length; multiplicacao++) {
				    	
				      matrizAxB[linhas][colunas] += matrizA[linhas][multiplicacao] * matrizB[multiplicacao][colunas]; 
				    	}
				    saida.println(matrizAxB[linhas][colunas]);			}
		}
}
}

public class MultiplicacaoMatrizes {
	private static PrintStream saida = System.out;
	private static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		int linha_a = entrada.nextInt();
		int coluna_a = entrada.nextInt();
		int coluna_b = entrada.nextInt();
		
		
		int[][] matrizA = new int[linha_a][coluna_a];
		int[][] matrizB = new int[coluna_a][coluna_b];
		int[][] matrizAxB = new int[matrizA.length][matrizB[0].length];
		
		
		for (int i = 0; i < linha_a; i++) {
			for (int j=0; j < coluna_a; j++) {
				matrizA[i][j] = entrada.nextInt();

			}
		}
		
		for (int i = 0; i < coluna_a; i++) {
			for (int j = 0; j < coluna_b; j++) {
				matrizB[i][j] = entrada.nextInt();
			}
		}
		
		
		for (int linhas = 0; linhas < matrizAxB.length; linhas++) {
			
			  for (int colunas = 0; colunas < matrizAxB[0].length; colunas++) {
				  
			    for (int multiplicacao = 0; multiplicacao < matrizB.length; multiplicacao++) {
			    	
			      matrizAxB[linhas][colunas] += matrizA[linhas][multiplicacao] * matrizB[multiplicacao][colunas]; 
			    	}
			    saida.println(matrizAxB[linhas][colunas]);
			    }
			  }

		}
	}

public class MultiplicacaoMatrizes {
	
	public static void main(String[] args) {
		int linhasA = MatrizesUtil.lerNumeroDeLinhasOuColunasDaMatriz(Matriz.linhas, NomesMatrizes.MATRIZ_A);
		int colunasA = MatrizesUtil.lerNumeroDeLinhasOuColunasDaMatriz(Matriz.colunas, NomesMatrizes.MATRIZ_A);
		int linhasB = colunasA;
		int colunasB = MatrizesUtil.lerNumeroDeLinhasOuColunasDaMatriz(Matriz.colunas, NomesMatrizes.MATRIZ_B);
		
		int matrizA[][] = MatrizesUtil.criarMatriz(linhasA, colunasA); 
		int matrizB[][] = MatrizesUtil.criarMatriz(linhasB, colunasB); 
		
		MatrizesUtil.preencherEImprimirMatriz(matrizA, NomesMatrizes.MATRIZ_A);
		MatrizesUtil.preencherEImprimirMatriz(matrizB, NomesMatrizes.MATRIZ_B);
		
		int[][] matrizAxB = multiplicarMatrizes(matrizA, matrizB);
		MatrizesUtil.imprimirMatriz(matrizAxB, "Matriz AxB");
	}

	private static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
		int[][] matrizAxB = MatrizesUtil.criarMatriz(matrizA.length, matrizB[0].length);
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				for (int k = 0; k < matrizB.length; k++) {
					matrizAxB[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}
		return matrizAxB;
	}

}

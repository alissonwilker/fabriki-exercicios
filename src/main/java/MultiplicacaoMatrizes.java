public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		

		int matrizA[][] = new int[][] { { 2, 3 }, { 1, 0 }, { 4, 5 } };
		int matrizB[][] = { { 3, 1 }, { 2, 4 } };
		int[][] matrizC = new int[matrizA.length][matrizB[0].length];
		for (int i = 0; i < matrizA.length; i++) {
		  for (int j = 0; j < matrizB[0].length; j++) {
		    for (int k = 0; k < matrizB.length; k++) {
		      matrizC[i][j] += matrizA[i][k] * matrizB[k][j]; }}}
		System.out.print("matrizC = { ");
		for (int i = 0; i < matrizC.length; i++) {
		  System.out.print("{");
		  for (int j = 0; j < matrizC[0].length; j++) {
		    System.out.print(" " + matrizC[i][j] + ","); }
		  System.out.print("}, "); }
		System.out.println("}");
	}
}

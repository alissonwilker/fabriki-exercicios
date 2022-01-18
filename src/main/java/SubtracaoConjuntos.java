public class SubtracaoConjuntos {

	public static void main(String[] args) {

		int matrizA[][] = new int[][] { { 1, 2 }, { 3, 0 }, { 2, 0 } };
		int matrizB[][] = { { 1, 3 } };
		int[][] matrizC = new int[matrizA.length][matrizB[0].length];
		for (int i = 0; i < matrizA.length; i++) {
		  for (int j = 0; j < matrizB[0].length; j++) {
		    for (int k = 0; k < matrizB.length; k++) {
		      matrizC[i][j] = matrizA[i][k] - matrizB[k][j]; }}}
		System.out.print("matrizC = { ");
		for (int i = 0; i < matrizC.length; i++) {
		  System.out.print("{");
		  for (int j = 0; j < matrizC[0].length; j++) {
		    System.out.print(" " + matrizC[i][j] + ","); }
		  System.out.print("}, "); }
		System.out.println("}");
	}
}

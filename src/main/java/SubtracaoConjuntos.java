public class SubtracaoConjuntos {

	public static void main(String[] args) {
		int A [][] = new int[][] {{1,2,3}};
		int B [][] = {{2}};
		int[][] C = new int[A.length][B[0].length];
		for(int s = 0; s<A.length;s++) {
			for(int r = 0; r<B[0].length;r++) {
				C[s][r] -= A[s][s] - B[r][r];
		
			}
		}
	System.out.print("");
	for (int s = 0; s < C.length; s++) {
		System.out.print("");
		for (int r = 0; r < C.length;r++) {
			System.out.print("" + C[s][r]+"");
		}
		System.out.print("\n");
	}
	System.out.print("");
	}

}

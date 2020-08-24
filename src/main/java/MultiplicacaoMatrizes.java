public class MultiplicacaoMatrizes {

	public MultiplicacaoMatrizes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[][] A = {
				{2,3},
				{1,0},
				{4,5}
				};
		int[][] B = {
				{3,1},
				{2,4}
				};
		int M[][] = new int[A.length][B[0].length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				for (int k = 0; k < B.length; k++) {
				M[i][j] = M[i][j] + A[i][k]*B[k][j];
				}
			}
	}
		for (int i= 0; i < M.length; i++) {
			System.out.println("");
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j]+" ");
				
			}
			
		}
	
	}
}

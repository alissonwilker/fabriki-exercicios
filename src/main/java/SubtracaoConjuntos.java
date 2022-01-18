package aula10;


public class SubtracaoConjuntos {

	public static void main(String[] args) {
		
		final int [][] A = {
				{1, 2},
				{3, }
		};
		final int  [][] B = {
				{2, }
		};
		
		int [][] AxB = new int[A.length][B[1].length];
		
		for (int i=0; i< AxB.length; i++) {
			for (int j = 0; j < AxB[0].length; j++) {
				for (int k = 0; k < A[0].length; k++) {
					AxB[i][j] += A[i][k] - B[k][j];
					
			}
		}
		
			 for (int i = 0; i < AxB.length; i++) {
			        System.out.print("{");
				for (int j = 0; j < AxB[0].length; j++) {
				    System.out.print(" " +  AxB[i][j] + ",");
				}
			        System.out.println("}, ");
			    }


	}

	}
}

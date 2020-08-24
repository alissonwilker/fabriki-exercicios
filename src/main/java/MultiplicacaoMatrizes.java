import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public MultiplicacaoMatrizes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// número de linhas de A
		int numeroLA = scanner.nextInt();
		// número de colunas de A e de linhas de B
		int numeroCA = scanner.nextInt();		
		// número de colunas de B
		int numeroCB = scanner.nextInt();
		
		int A[][] = new int[numeroLA][numeroCA];
		int B[][] = new int[numeroCA][numeroCB];
		
		// Elementos de A
		for (int i = 0; i < numeroLA; i++) {
			for (int j = 0; j < numeroCA; j++) {
				A[i][j]=scanner.nextInt();
			}
		}
		for (int i = 0; i < numeroCA; i++) {
			for (int j = 0; j < numeroCB; j++) {
				B[i][j]=scanner.nextInt();
			}
		}
		

		int M[][] = new int[A.length][B[0].length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				for (int k = 0; k < B.length; k++) {
				M[i][j] = M[i][j] + A[i][k]*B[k][j];
				}
			}
	}
		for (int i= 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.println(M[i][j]);
				
			}
			
		}
	
	}
}

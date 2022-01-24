import java.util.Scanner;
public class MultiplicacaoMatrizes{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int linha = 2;
		int coluna = 2;
		int[][] MatrizA = new int[linha][coluna];
		int linha2 = 2;
		int coluna2 = 2;
		int[][] MatrizB = new int[linha2][coluna2];
		
		
		for (int i=0; i < linha; i++) {
			for (int j = 0;j < coluna; j++) {
				System.out.print("Digite um valor da Matriz A: ");
				MatrizA[i][j] = entrada.nextInt();
				
			}
		}
		for (int i=0; i < linha2; i++) {
			for (int j = 0;j < coluna2; j++) {
				System.out.print("Digite um valor da Matriz B: ");
				MatrizB[i][j] = entrada.nextInt();
			}
		}
		for (int i=0; i < linha; i++) {
			for (int j = 0;j < coluna; j++) {
				System.out.print(MatrizA[i][j] + " ");
				
			}
		}
		System.out.print("");
		for (int i=0; i < linha2; i++) {
			for (int j = 0;j < coluna2; j++) {
				System.out.print(MatrizB[i][j] + " ");
				
			}
			System.out.print("");
		}
		
		if(MatrizA[0].length == MatrizB.length) {
			
			int[][] MatrizC = new int[linha][coluna2];
			for (int i = 0; i< linha; i++) {
				for(int j = 0;j < coluna2;j++) {
					for(int k = 0; k < linha2; k++) {
						MatrizC[i][j] += MatrizA[i][k] * MatrizB[k][j];
					}
					
				}
			}
			for(int i = 0; i < linha; i++) {
				for(int j = 0; j < coluna2; j++) {
					System.out.print(MatrizC[i][j] + "");
				}
				System.out.println("");
			}
			
		}else {
			System.out.print("não é possivel realizar a operação.");
		}
		
	}

}

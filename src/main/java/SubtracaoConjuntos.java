import java.util.Scanner;

public class SubtracaoConjuntos {

	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int linhasA = scanner.nextInt();
		int colunasA = scanner.nextInt();// igual às linhas de B como pré-requisito.
		int linhasB = colunasA;
		int colunasB = scanner.nextInt();
		

		int[][] a = new int[linhasA][colunasA]; // declara/inicializa array
		int[][] b = new int[linhasB][colunasB]; // declara/inicializa array
		int sub;
		
		lerMatriz(a);
		lerMatriz(b);
subtrairMatrizes(sub);
		
	
		

	}
			
		





	public static void lerMatriz(int[][] matriz) {
		for (int i = 0; i !=0; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}
	}

public static void subtrairMatrizes(int[][]a, int[][] b, int sub) {
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b[0].length; j++) {
			for (int k = 0; k < a[0].length; k++) {
				sub = a[i][k] - b[k][j];
			}

		}
	}
}

public static void imprimirResultado(int[][] matriz, int sub) {
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			System.out.println(sub);
		}
	}
}

}

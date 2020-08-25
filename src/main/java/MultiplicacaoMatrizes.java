import java.util.Scanner;

public class MultiplicacaoMatrizes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linhasMatriz1, colunasMatriz1, colunasMatriz2;
		
		System.out.println("Insira o número de linhas da primeira matriz");
		linhasMatriz1 = sc.nextInt();
		System.out.println("Insira o numero de colunas da primeira matriz");
		colunasMatriz1 = sc.nextInt();
		System.out.println("Insira o número de colunas da segunda matriz");
		colunasMatriz2 = sc.nextInt();
		
		int[][] matriz1 = new int[linhasMatriz1][colunasMatriz1];
		int[][] matriz2 = new int[colunasMatriz1][colunasMatriz2];
		
		System.out.println("Insira os números da primeira matriz, linha por linha");
		for(int a=0; a<linhasMatriz1; a++) {
			for(int b=0; b<colunasMatriz1; b++) {
				System.out.println();
				matriz1[a][b] = sc.nextInt();}}
		
		System.out.println("insira os números da segunda matriz, linha por linha");
		for(int c=0; c<colunasMatriz1; c++){
			for(int d=0; d<colunasMatriz2; d++) {
				System.out.println();
				matriz2[c][d] = sc.nextInt();}}
		
		int[][] resultado = new int[linhasMatriz1][colunasMatriz2];
		for(int x=0; x<linhasMatriz1; x++) {
			for(int y=0; y<colunasMatriz2; y++) {
				for(int z=0; z<colunasMatriz1; z++) {
					resultado[x][y] += matriz1[x][z] * matriz2[z][y];}}}
		
		for (int linha=0; linha<resultado.length; linha++) {
			System.out.println("{");
			for (int coluna=0; coluna<resultado[0].length; coluna++) {
				System.out.println(resultado[linha][coluna] + ", ");	
			}
			System.out.println("}");}		
	}
}

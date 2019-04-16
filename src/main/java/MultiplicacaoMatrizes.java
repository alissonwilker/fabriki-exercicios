import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);

		//System.out.println("Digite o numero de linhas da matriz A");
		int linhasA = usuario.nextInt();
		//System.out.println("Digite o numero de colunas da matriz A");
		int colunasA = usuario.nextInt();
		int linhasB = colunasA;
		//System.out.println("Digite o numero de colunas da matriz B");
		int colunasB = usuario.nextInt();
		int matrizA[][] = new int[linhasA][colunasA];
		int matrizB[][] = new int[linhasB][colunasB];
		
		int matrizC[][] = new int[matrizA.length][matrizB[0].length];
		
		//System.out.println("matriz A");
		for(int i =0; i < linhasA; i++) {
			for(int j=0; j <colunasA; j++) {
				//System.out.println("Digite o numero da posição "+ i+j);
				matrizA[i][j] =usuario.nextInt();
			}
		}
		
		//System.out.println("matriz B");
		for(int i =0; i < linhasB; i++) {
			for(int j=0; j <colunasB; j++) {
				//System.out.println("Digite o numero da posição "+ i+j);
				matrizB[i][j] =usuario.nextInt();
			}
		}
		
		for(int i = 0; i < matrizA.length;i++) {
			for(int j = 0; j < matrizB[0].length;j++) {
				for(int k =0; k < matrizA[0].length;k++) {
					matrizC[i][j] += matrizA[i][k] *matrizB[k][j];
				}
			}
		}
		
		for(int i =0; i< matrizC.length;i++) {
			//System.out.print("{");
			for(int j=0; j < matrizC[0].length;j++) {
				System.out.print(matrizC[i][j]);
			}
			//System.out.println("}");
		}
		
		

	}
	

}

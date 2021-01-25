import java.util.Scanner;
public class MultiplicacaoMatrizes {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrizA [][];
		int matrizB [][];
		int matrizC [][];
		int cont,cont2, cont3;
		cont = entrada.nextInt();
		cont2 = entrada.nextInt();
		cont3 = entrada.nextInt();
		matrizA = new int [cont][cont2];
		matrizB = new int [matrizA.length][cont3];
		matrizC = new int[matrizA.length][matrizB[0].length];
		for (int i = 0; i < cont; i++) {
			for(int j = 0; j < cont2; j ++) {
				matrizA [i][j] = entrada.nextInt();
			}
			
		}
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < cont3; j ++) {
				matrizB [i][j] = entrada.nextInt();
					
			}}
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
			for (int k = 0; k < matrizA.length; k++) {
			matrizC[i][j] += matrizA[i][k] * matrizB[k][j]; }}}
		
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[0].length; j++) {
			System.out.println(matrizC[i][j]); }
		
		

	}

}
}

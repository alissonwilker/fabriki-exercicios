import java.util.Scanner;
import java.io.PrintStream;

public class MultiplicacaoMatrizes{
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numerodelinhasmatrizA = entrada.nextInt();
		int numerodecolunasmatrizA = entrada.nextInt();
		int numerodecolunasmatrizB = entrada.nextInt();
		
		int matrizA[][] = new int[numerodelinhasmatrizA][numerodecolunasmatrizA];
		int matrizB[][] = new int[numerodecolunasmatrizA][numerodecolunasmatrizB];
		int matrizAxB[][] = new int[matrizA.length][matrizB[0].length];
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		}
		for (int i = 0; i < matrizB.length; i++) {
				for (int j = 0; j < matrizB[0].length; j++) {
					matrizB[i][j] = entrada.nextInt();
				}
		}
		for (int i = 0; i < matrizA.length; i++) { // matrizA.length = até o limite da linha
			for (int j = 0; j < matrizB[0].length; j++) { // matriz.length = até o limite da
				for (int k = 0; k < matrizB.length; k++) {
					matrizAxB[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}
		for (int i = 0; i < matrizAxB.length; i++) {
			for (int j = 0; j < matrizAxB[0].length; j++) {
				saida.println(matrizAxB[i][j]);
			}
		}
	}
}

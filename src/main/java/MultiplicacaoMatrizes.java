import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
    private static Scanner scanner = new Scanner(System.in);
    private static PrintStream saida = System.out;

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
            	saida.println(matriz[i][j]);
            }
        }
    }

    private static void preencherMatriz(int[][] matriz) {
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[0].length; b++) {
                matriz[a][b] = scanner.nextInt();
            }
        }
    }

    private static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int[][] matrizAxB = new int[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    matrizAxB[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return matrizAxB;
    }

    public static void main(String[] args) {
        int linhasA = scanner.nextInt();
        int colunasA = scanner.nextInt();
        int linhasB = colunasA;
        int colunasB = scanner.nextInt();

        int matrizA[][] = new int[linhasA][colunasA];
        int matrizB[][] = new int[linhasB][colunasB];

        preencherMatriz(matrizA);
        preencherMatriz(matrizB);

        int[][] matrizAxB = multiplicarMatrizes(matrizA, matrizB);
        imprimirMatriz(matrizAxB);
    }

}

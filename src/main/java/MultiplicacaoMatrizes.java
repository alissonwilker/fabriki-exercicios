import java.util.Scanner;

public class MultiplicacaoMatrizes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int linhaMatrizA = scanner.nextInt();
        int colunaMatrizA = scanner.nextInt();
        int linhaMatrizB = scanner.nextInt();
        int colunaMatrizB = scanner.nextInt();

        int matrizA[][] = new int[linhaMatrizA][colunaMatrizA];
        int matrizB[][] = new int[linhaMatrizB][colunaMatrizB];
        int[][] matrizC = new int[matrizA.length][matrizB[0].length];

        for (int i = 0; i < linhaMatrizA; i++) {
            for (int j = 0; j < colunaMatrizA; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < linhaMatrizB; i++) {
            for (int j = 0; j < colunaMatrizB; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                System.out.println(matrizC[i][j]);
            }
        }
    }
}

import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicacaoMatrizes {

    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {
        int matrizA[][];
        int matrizB[][];
        int matrizC[][];

        Scanner entrada = new Scanner(System.in);
        int linha, coluna, linhaB, colunaB;

        linha = entrada.nextInt();

        coluna = entrada.nextInt();

        colunaB = entrada.nextInt();

        matrizA = new int[linha][coluna];
        matrizB = new int[coluna][colunaB];
        matrizC = new int[linha][colunaB];

        for (int x = 0; x < linha; x++) {
            for (int y = 0; y < coluna; y++) {
                matrizA[x][y] = entrada.nextInt();
            }
        }

        for (int x = 0; x < coluna; x++) {

            for (int y = 0; y < colunaB; y++) {
                matrizB[x][y] = entrada.nextInt();

            }
        }

        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizB[0].length; y++) {
                for (int k = 0; k < matrizB.length; k++) {
                    matrizC[x][y] += matrizA[x][k] * matrizB[k][y];
                }
            }
        }

        for (int x = 0; x < matrizC.length; x++) {
            for (int y = 0; y < matrizC[0].length; y++) {

                System.out.println(matrizC[x][y]);
            }
        }

    }
}

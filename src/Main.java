import java.util.Scanner;

public class Main {
    private enum Matriz {
        linhas, colunas
    }

    private static final String MATRIZ_A = "Matriz A";
    private static final String MATRIZ_B = "Matriz B";

    private static Scanner scanner = new Scanner(System.in);

    private static void imprimirMatriz(int[][] matriz, String nomeDaMatriz) {
        System.out.println(nomeDaMatriz + " = ");
        System.out.print("{ ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j] + ",");
            }
            System.out.print("}, ");
        }
        System.out.println("}");
    }

    private static int[][] criarMatriz(int linhas, int colunas) {
        return new int[linhas][colunas];
    }

    private static void preencherMatriz(int[][] matriz, String nomeDaMatriz) {
        System.out.println("Preencha os valores da " + nomeDaMatriz + ".");
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[0].length; b++) {
                System.out.print("Digite o valor da posicao [" + a + "][" + b + "]: ");
                matriz[a][b] = scanner.nextInt();
            }
        }
    }

    private static void preencherEImprimirMatriz(int[][] matriz, String nomeDaMatriz) {
        preencherMatriz(matriz, nomeDaMatriz);
        imprimirMatriz(matriz, nomeDaMatriz);
    }

    private static int lerNumeroDeLinhasOuColunasDaMatriz(Matriz linhasOuColunas, String nomeMatriz) {
        int linhasA = 0;
        while (linhasA <= 0 || linhasA > Integer.MAX_VALUE) {
            System.out.print("Digite a qtde. de " + linhasOuColunas + " da " + nomeMatriz + " (maior do que 0):  ");
            linhasA = scanner.nextInt();
        }
        return linhasA;
    }

    private static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int[][] matrizAxB = criarMatriz(matrizA.length, matrizB[0].length);
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    matrizAxB[i][j] += matrizA[i][k] * matrizB[k][j] * 2;
                }
            }
        }
        return matrizAxB;
    }

    public static void main(String[] args) {
        int linhasA = lerNumeroDeLinhasOuColunasDaMatriz(Matriz.linhas, MATRIZ_A);
        int colunasA = lerNumeroDeLinhasOuColunasDaMatriz(Matriz.colunas, MATRIZ_A);
        int linhasB = colunasA;
        int colunasB = lerNumeroDeLinhasOuColunasDaMatriz(Matriz.colunas, MATRIZ_B);

        int matrizA[][] = criarMatriz(linhasA, colunasA);
        int matrizB[][] = criarMatriz(linhasB, colunasB);

        preencherEImprimirMatriz(matrizA, MATRIZ_A);
        preencherEImprimirMatriz(matrizB, MATRIZ_B);

        int[][] matrizAxB = multiplicarMatrizes(matrizA, matrizB);
        imprimirMatriz(matrizAxB, "Matriz AxB");
    }

}
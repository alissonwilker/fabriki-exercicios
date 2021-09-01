import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) throws Exception {
        //entrada
        Scanner entrada = new Scanner(System.in);
        int linhasA, colunasA, colunasB = 0;
        linhasA = entrada.nextInt();
        colunasA = entrada.nextInt();
        colunasB = entrada.nextInt();
        
        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[colunasA][colunasB];

        preencherMatriz(entrada, matrizA);
        
        preencherMatriz(entrada, matrizB);

        entrada.close();

        //processamento
        int[][] matrizAXB = new int[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizAXB.length; i++) {
            for (int j = 0; j< matrizAXB[0].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    matrizAXB[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        //saída
        imprimirMatriz(matrizAXB); // método/função
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna =0; coluna < matriz[0].length; coluna++) {
                System.out.println(matriz[linha][coluna]);
            }
        }
    }

    private static void preencherMatriz(Scanner entrada, int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                matriz[linha][coluna] = entrada.nextInt();
            }
        }
    }
}

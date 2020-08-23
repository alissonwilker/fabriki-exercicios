import java.util.Scanner;

public class MultiplicacaoMatrizes{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int linhaMatrizA = scanner.nextInt();
        int colunaMatrizA = scanner.nextInt();
        int colunaMatrizB = scanner.nextInt();

        int matrizA[][] = new int[linhaMatrizA][colunaMatrizA];
        int matrizB[][] = new int[colunaMatrizA][colunaMatrizB];
        int[][] matrizC = new int[linhaMatrizA][colunaMatrizB];

        for (int i = 0; i < linhaMatrizA; i++) {
            for (int j = 0; j < colunaMatrizA; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < colunaMatrizA; i++) {
            for (int j = 0; j < colunaMatrizB; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }
        
        
        
        for (int i = 0; i < linhaMatrizA; i++) {
            for (int j = 0; j < colunaMatrizB; j++) {
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

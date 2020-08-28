import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(final String[] args) {
    
        final Scanner scanner = new Scanner (System.in);
        final int linhaA = scanner.nextInt();
        final int colunaA = scanner.nextInt();
        final int colunaB = scanner.nextInt();
        final int[][] matrizA = new int [linhaA][colunaA];
        final int[][] matrizB = new int [colunaA][colunaB];
        final int[][] matrizResultado = new int [linhaA][colunaB];

        //leitura dos elementos da matriz A
        for (int i=0; i<linhaA; i++){
            for (int j=0; j<colunaA; j++) {
                System.out.println("Insira o elemento "+i+j);
                matrizA[i][j] = scanner.nextInt();
            }
        }
        //leitura dos elementos da matriz B
        for (int i=0; i<colunaA; i++){
            for (int j=0; j<colunaB; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        //Cálculo da mutiplição de matrizes
        for (int i=0; i<linhaA; i++){
            for (int j=0; j<colunaB; j++) {
                for (int k=0; k<colunaA; k++) {
                    matrizResultado[i][j] += matrizA[i][k]*matrizB[k][j];
                }
            }
        }

        //Apresentação do resultado da mutiplição 
        for (int i=0; i<linhaA; i++){
            for (int j=0; j<colunaB; j++) {
                System.out.println(matrizResultado[i][j]);
            }
        }
    }
}

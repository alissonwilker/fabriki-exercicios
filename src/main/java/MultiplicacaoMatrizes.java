import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        int linhaA = scanner.nextInt();
        int colunaA = scanner.nextInt();
        int colunaB = scanner.nextInt();
        int[][] matrizA = new int [linhaA][colunaA];
        int[][] matrizB = new int [colunaA][colunaB];
        int[][] matrizResultado = new int [linhaA][colunaB];

        for (int i=0; i<linhaA; i++){
            for (int j=0; j<colunaA; j++) {
                System.out.println("Insira o elemento "+i+j);
                matrizA[i][j] = scanner.nextInt();
            }
        }
        for (int i=0; i<colunaA; i++){
            for (int j=0; j<colunaB; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }
        for (int i=0; i<linhaA; i++){
            for (int j=0; j<colunaB; j++) {
                for (int k=0; k<colunaA; k++) {
                    matrizResultado[i][j] += matrizA[i][k]*matrizB[k][j];
                }
            }
        }
        for (int i=0; i<linhaA; i++){
            for (int j=0; j<colunaB; j++) {
                System.out.println(matrizResultado[i][j]);
            }
        }
    }
}

import java.util.Scanner;

public class MultiplicacaoMatrizes {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String args[]) {
        int linhaA = 2;
        int colunaA = 2;
        int [][] matrizA = new int [linhaA][colunaA];
        
        int linhaB = 2;
        int colunaB = 2;
        int [][] matrizB = new int [linhaB][colunaB];
        
        
        for(int i = 0; i < linhaA; i++) {
            for( int j =0; j < colunaA; j++){
                matrizA[i][j] = entrada.nextInt();
            }
        }
        
        for(int i = 0; i < linhaB; i++) {
            for( int j =0; j < colunaB; j++){
                matrizB[i][j] = entrada.nextInt();
            }
        }
        
        if(matrizA[0].length == matrizA.length) {
            
            int[][] matrizC = new int [linhaA][colunaB];
            for(int i = 0; i < linhaA; i++) {
                for( int j = 0; j < colunaB; j++) {
                    for (int k = 0; k < linhaB; k++ ) {
                        matrizC[i][j] += matrizA[i][k] * matrizB[i][j];
                    }
                }
            }
            
            for(int i = 0; i < linhaB; i++) {
            for( int j =0; j < colunaB; j++){
                System.out.println(matrizC[i][j]);
                }
            }
        }
    }
}

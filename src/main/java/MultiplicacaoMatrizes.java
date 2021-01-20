import java.util.Scanner;

public class MultiplicacaoMatrizes {

    public static void main(String[] args) {
	    Scanner scanner= new Scanner(System.in);

	    //DECLARAÇÃO DE VARIÁVEIS
	    int qtdLinhasA , qtdColunasA , qtdColunasB = 0;

        //LEITURA DE TAMANHOS DAS MATRIZES
        qtdLinhasA = scanner.nextInt();
        qtdColunasA = scanner.nextInt();
        qtdColunasB = scanner.nextInt();

        //DECLARAÇÃO DE MATRIZES
	    int[][] matrizA = new int[qtdLinhasA][qtdColunasA];
	    int[][] matrizB = new int[qtdColunasA][qtdColunasB];
	    int[][] matrizResultante = new int[qtdLinhasA][qtdColunasB];

	    //LEITURA DE VALORES DA MATRIZ A
	    for(int i = 0; i < qtdLinhasA; i++){
	        for (int j = 0; j < qtdColunasA; j++){
	            matrizA[i][j] = scanner.nextInt();
            }
        }

	    //LEITURA DE VALORES DA MATRIZ B
        for(int i = 0; i < qtdColunasA; i++){
            for (int j = 0; j < qtdColunasB; j++){
                matrizB[i][j] = scanner.nextInt();
            }
        }

        //CÁLCULO DA MATRIZ RESULTANTE
        for (int i = 0; i < qtdLinhasA; i++){
            for (int j = 0; j < qtdColunasB; j++){
                for (int k = 0; k < qtdColunasA; k++){
                    matrizResultante[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        //OUTPUT
        for (int i = 0; i < qtdLinhasA; i++){
            for (int j = 0; j < qtdColunasB; j++){
                System.out.println(matrizResultante[i][j]);
            }
        }
    }
}

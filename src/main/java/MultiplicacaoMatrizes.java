import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MultiplicacaoMatrizes {

    public static void main(String[] args) {
        {
            int linhas, colunas, colunasb;
            int soma = 0, c, d, k;

            Scanner in = new Scanner(System.in);
            //System.out.println("Linhas Matriz A");
            linhas = in.nextInt();
            //System.out.println("Colunas Matriz A");
            colunas = in.nextInt();
            //  System.out.println("Colunas Matriz B");
            colunasb = in.nextInt();

            int a[][] = new int[linhas][colunas];

            //  System.out.println("Valor dos Elementos");
            for (c = 0; c < linhas; c++) {
                for (d = 0; d < colunas; d++) {
                    a[c][d] = in.nextInt();
                }
            }
            int b[][] = new int[colunas][colunasb];
            int Multiplicar[][] = new int[linhas][colunasb];

//                System.out.println("Valor dos Elementos Matriz B");
            for (c = 0; c < colunas; c++) {
                for (d = 0; d < colunasb; d++) {
                    b[c][d] = in.nextInt();
                }
            }

            for (c = 0; c < linhas; c++) {
                for (d = 0; d < colunasb; d++) {
                    for (k = 0; k < colunas; k++) {
                        soma = soma + a[c][k] * b[k][d];
                    }

                    Multiplicar[c][d] = soma;
                    soma = 0;
                }
            }

            // System.out.println("Valor da Multiplicação das Matrizes Matrizes:");
            for (c = 0; c < linhas; c++) {
                for (d = 0; d < colunasb; d++) {
                    System.out.println(Multiplicar[c][d]);
                }

                // System.out.print("\n");
            }
        }
    }
}

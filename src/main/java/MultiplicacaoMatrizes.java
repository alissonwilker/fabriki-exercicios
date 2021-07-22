import java.util.Scanner;
public class MultiplicacaoMatrizes {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
       
        int linhas_A = Sc.nextInt();
        int colunas_A = Sc.nextInt();
        int[][] A = new int [linhas_A][colunas_A];
        
        int colunas_B = Sc.nextInt();
        int linhas_B =  colunas_A;
        int[][] B = new int [linhas_B][colunas_B];
        
        for(int i = 0; i < linhas_A; i++){
            for(int j = 0; j < colunas_A; j++){
                A[i][j] = Sc.nextInt();
            }     
        }
        
        for(int i = 0; i < linhas_B; i++){
            for(int j = 0; j < colunas_B; j++){
                B[i][j] = Sc.nextInt();
            }
        }   
        Sc.close();
        
        int [][] AxB = new int [linhas_A][colunas_B]; 
        
        for(int i = 0; i < linhas_A; i ++){
            for(int j = 0; j < colunas_B; j++){
                for(int k = 0;  k < linhas_B; k ++){
                    AxB[i][j] += A[i][k] * B[k][j];
                    
                }
            }
        }
 
        for(int i = 0; i < linhas_A; i++){
            for(int j = 0; j < colunas_B; j++){
                System.out.println(AxB[i][j]);
            }
        }
    }
    
}

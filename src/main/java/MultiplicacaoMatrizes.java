import java.util.Scanner;



public class MultiplicacaoMatrizes {

    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        
        int linha= tec.nextInt();
        int coluna1= tec.nextInt();
        int [][] matrizA= new int [linha][coluna1];
        
       
        int coluna2=tec.nextInt();
        int [][] matrizB= new int [coluna1][coluna2];
        
        int [][]matrizC= new int[linha][coluna2];
        
        for(int i=0;i<linha;i++){
            for(int b=0;b<coluna1;b++){
   
                matrizA[i][b]=tec.nextInt();
            }
        }
        
        for(int i=0;i<coluna1;i++){
            for(int b=0;b<coluna2;b++){
   
                matrizB[i][b]=tec.nextInt();
            }
        }
        
        
        for(int i=0;i<linha;i++){
             for(int j=0;j<coluna2;j++){
                 for(int k=0;k<coluna1;k++){
                     matrizC[i][j]+=matrizA[i][k]*matrizB[k][j];
                 }
             }
        }
        
        for(int i=0;i<linha;i++){
            for(int j=0;j<coluna2;j++){
      
                System.out.println("\n"+matrizC[i][j]);
                
            }
        }
        
        
    }
}    

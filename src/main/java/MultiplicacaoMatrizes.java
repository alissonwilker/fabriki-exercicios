import java.util.Scanner;
public class MultiplicacaoMatrizes {

    
public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);   

int a=0,b=0;
int c=0,d=0;

b=entrada.nextInt();

a=entrada.nextInt();

int[][] matrizA=new int[b][a];

c=entrada.nextInt();

int[][] matrizB=new int[a][c];
for (int i = 0; i < matrizA.length; i++) {
for (int j = 0; j < matrizA[1].length; j++) {
matrizA[i][j]=entrada.nextInt();
    }
}
for (int i = 0; i < a; i++) {
for (int j = 0; j < c; j++) {
matrizB[i][j]=entrada.nextInt();
    }
}

int[][] matrizResul=new int[b][c];
for (int i = 0; i < matrizResul.length; i++) {
for (int j = 0; j < matrizResul[0].length; j++) {
for (int k = 0; k < a; k++) {
matrizResul[i][j]+=matrizA[i][k]*matrizB[k][j];
        }
    }
}

for (int i = 0; i < matrizResul.length; i++) {
for (int j = 0; j < matrizResul[0].length; j++) {
System.out.println(matrizResul[i][j]);


            }
        }
    }
}

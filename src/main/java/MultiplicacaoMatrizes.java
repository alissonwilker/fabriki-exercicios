import java.util.Scanner;
public class MultiplicacaoMatrizes {
public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
int a=0,b=0,c=0,d=0;
b=leia.nextInt();

a=leia.nextInt();
int[][] matrizA=new int[b][a];

c=leia.nextInt();
int[][] matrizB=new int[a][c];
for (int i = 0; i < matrizA.length; i++) {
for (int j = 0; j < matrizA[1].length; j++) {
matrizA[i][j]=leia.nextInt();
}
}
for (int i = 0; i < a; i++) {
for (int j = 0; j < c; j++) {
matrizB[i][j]=leia.nextInt();
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

import java.util.Scanner;

public class MultiplicacaoMatrizes {

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int linhasA = entrada.nextInt();
int colunasA = entrada.nextInt();
int colunasB = entrada.nextInt();

int matrizA[][] = new int[linhasA][colunasA];
int matrizB[][] = new int[colunasA][colunasB];

for (int i = 0; i < linhasA; i++) {
for (int j = 0; j < colunasA; j++) {
matrizA[i][j] = entrada.nextInt();
}
}
for (int i = 0; i < colunasA; i++) {
for (int j = 0; j < colunasB; j++) {
matrizB[i][j] = entrada.nextInt();
}
}
int[][] matrizC = new int[matrizA.length][matrizB[0].length];
for (int i = 0; i < matrizA.length; i++) {
for (int j = 0; j < matrizB[0].length; j++) {
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

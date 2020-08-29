public class MultiplicacaoMatrizes {
 public static void main(String[] arg){
   Scanner scanner = new Scanner(System.in);
 int linhaA = scanner.nextInt();
 int colunaA = scanner.nextInt();
 int colunaB = scanner.nextInt();
 int [][] matrizA = new int[linhaA][colunaA]; 
 int [][] matrizB = new int[colunaA][colunaB];
 int [][] matrizC = new int[linhaA][colunaB];

 for(int i=0; i <linhaA; i++){
 for (int j=0; j <colunaA; j++){
   matrizA[i][j] = scanner.nextInt();
 }
 }
 for(int i=0; i <colunaA; i++){
 for (int j=0; j <colunaB; j++){
   matrizB[i][j] = scanner.nextInt(); 
 }
 }
 for (int i=0; i < matrizA.length; i++) {
     for (int j=0; j < matrizB[0].length; j++) {
       for (int K=0; k < matrizB.length; k++) {
          matrizC[i][j]+= matrizA[i][k]*matrizB[k][j];
  }
  }
 }

for (int i=0; i < matrizC.length; i++) {
for (int j=0; j < matrizC[0].length; j++) {
     System.out.println(matrizC[i][j]);
 }
}
 }
}

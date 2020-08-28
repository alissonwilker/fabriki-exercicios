public class MultiplicacaoMatrizes {
public static void main(String[]arg){
  Scanner scanner = new scanner(System.in);
  int linhasA = 2;
  int colunasA = 2;
  int [][] matrizA = new int[linhas][colunas];

  int linhasB = 2;
  int colunasB = 2;
  int [][] matrizB = new int[linhasB][colunasB]; 
 
  int matrizA [][]=new int [linhasA][colunasA];
  for(int i=0; i <linhasA; i++){
  for (int j=0; j <colunasB; j++){
    //system.out.print[][];
    matrizA[i][j] = scanner.nextInt();
  }
  }
  system.out.println("");
  int matrizB [][]=new int [colunasA][colunasB];
  for(int i=0; i <linhasA; i++){
  for (int j=0; j <colunasB; j++){
   //system.out.print[][];
    matrizB[i][j] = scanner.nextInt(); 
  }
  }
for(int i=0; i <linhasA; i++){
  for (int j=0; j <colunasA; j++){
 //  system.out.print{matrizA[i][j] +""; 
  }
    System.out.println("");
  }
System.out.println("");
  for(int i=0; i <linhasB; i++){
  for (int j=0; j <colunasB; j++){
   // system.out.print{matrizB[i][j] +""; 
 }
   // System.out.println("");

//int matrizB[][] = { {linhasA}, {colunasB} };
//if(matrizA[0].lenght == matrizA.leght){
int matrizA[][]=new int [][]{{1,2},{3,4}};
int matrizB[][]= {{-1,3},{4,2}};    
    int[][] matrizC = new int[matrizA.length][matrizB[0].length];
  for (int i = 0; i < matrizA.length; i++) {
	  for (int j = 1; j < matrizB[0].length; j++) {
	    for (int k = 0; k < matrizB.length; k++) {
    //int matrizc[][] = new int [linhas.length][colunasB[0].length];
         matrizC[i][j] += matrizA[i][k] * matrizB[k][j]; }}}
}
}
}

for (int i = 0; i < matrizC.length; i++) {
  for (int j = 0; j < matrizC[0].length; j++) {
		    System.out.println(matrizC[i][j] +"");
}
  } 
  

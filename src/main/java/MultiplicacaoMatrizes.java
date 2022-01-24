import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner digitar = new Scanner(System.in);
			
		int linhasA, colunasA, colunasB;
		int i,j,k;
		
		linhasA = digitar.nextInt();
		colunasA = digitar.nextInt();
		colunasB = digitar.nextInt();
		
		int[][] matriz_A = new int[linhasA][colunasA];
		int[][] matriz_B = new int[colunasA][colunasB];
		int[][] multi = new int[matriz_A.length][matriz_B.length];
						
		for(i=0; i<linhasA; i++)
			for(j=0; j<colunasA; j++)
			{
				matriz_A[i][j]=digitar.nextInt();		
			}
	
		for(i=0; i<colunasA; i++)
			for(j=0; j<colunasB; j++)
			{
				matriz_B[i][j]=digitar.nextInt();			
			}
			
		for (i = 0; i < matriz_A.length; i++) {
			  for (j = 0; j < matriz_B[0].length; j++) {
				  for (k = 0; k < matriz_B.length; k++)
				multi[i][j]+= matriz_A[i][k] * matriz_B[k][j];
				System.out.println(multi[i][j]);
		}
	}
}
	}

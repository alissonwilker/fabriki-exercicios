import java.util.Scanner;

public class MultiplicacaoMatrizes {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n, m, z;
		
		
		n = s.nextInt();
		
		
		m = s.nextInt();
		
		
		z = s.nextInt();
		
		int[][] matriz;
		matriz = new int[n][m];
		
		
		for(int i = 0; i<matriz.length;i++) {
			for(int j = 0; j<matriz[i].length;j++) {
				
				matriz[i][j] = s.nextInt();
				
			}
		}
				
		int[][] matriz2;
		matriz2 = new int[m][z];
		
		for(int i = 0; i<m;i++) {
			for(int j = 0; j<z;j++) {
				
				matriz2[i][j] = s.nextInt();
				
			}
		}
		
		int[][] matrizSoma;
		matrizSoma = new int[n][z];
				
		for(int i=0; i<matrizSoma.length; i++){
			for(int j=0; j<matrizSoma[i].length; j++){
				for(int k=0; k<matriz[i].length; k++){
					matrizSoma[i][j] += matriz[i][k] * matriz2[k][j];
				}
			}
		}
				
		for (int i = 0; i < n; i++) {
	        for (int j = 0; j < z; j++) {
		    System.out.println( matrizSoma[i][j]);
	        }
	        
	    }
		
	}

}

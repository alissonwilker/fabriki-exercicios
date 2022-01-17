
import java.util.Scanner;
public class SubtracaoConjuntos {
public static void main(String[]args) {
	
	try (Scanner tec = new Scanner(System.in)) {
		int n = 0;
		int [][] mat = new int[n][n];
			
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				mat [i][j]= tec.nextInt();
			}
		}
		int sub= 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sub = sub - mat[i][j];
		}
		System.out.println(sub);
  }
	}
 }
}

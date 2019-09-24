import java.io.PrintStream;
import java.util.Scanner;
import java.lang.String;

public class MultiplicacaoMatrizes{
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int la = entrada.nextInt();
		int ca = entrada.nextInt();
		int cb = entrada.nextInt();
		int lb= ca;
		int[][] a = new int[la][ca];
		int[][] b = new int[lb][cb];
		int[][] axb = new int[la][cb];
		
		
		
			for (int i = 0; i < la; i++) {
				for (int j = 0; j < ca; j++) {
					a[i][j]= entrada.nextInt();
				}
			}
		
			
			for (int i = 0; i < lb; i++) {
				for (int j = 0; j < cb; j++) {
					b[i][j]= entrada.nextInt();
				}
			}

		
		

		for (int i = 0; i < la; i++) {
			for (int j = 0; j < cb; j++) {
				for (int k = 0; k < lb; k++) {
					axb[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for (int i = 0; i < la; i++) {
			for (int j = 0; j < cb; j++) {
				saida.println(axb[i][j]);;
			}
		}
		
	}

}

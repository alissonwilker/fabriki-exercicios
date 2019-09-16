import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int n = entrada.nextInt();
		int maior = n;
		
		
		if(n != 0) {
			for (int i = 0; n!= 0; i++) {
				n = entrada.nextInt();
				if(maior <= n && n != 0) {
					maior = n;
				}	
			}
			saida.println("maior = "+ maior);
		} else {
			saida.println("maior = 0");
		}
	
		

	}
}

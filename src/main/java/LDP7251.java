import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int num;
		int maior;
		
		num = entrada.nextInt();
		maior = num;
		
		
		if (num != 0) {
			while(num != 0) {
				num = entrada.nextInt();
				
				if (num > 0) {
					if (num > maior) {
						maior = num;
					}
				} else if (num < 0) {
					if (num > maior) {
						maior = num;
					}
				}
			};
		}
		saida.println("maior = " + maior);
	}
}

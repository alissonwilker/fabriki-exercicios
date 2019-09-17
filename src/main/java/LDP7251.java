import java.util.Scanner;
import java.io.PrintStream;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int n = entrada.nextInt();
		int maior = n;

		while (n != 0) {

			n = entrada.nextInt();
			if(n==0) {
				break;
			}
			
			if (n > maior) {
				maior = n;

			}
		}

		saida.println("maior = "+maior);

	}

}

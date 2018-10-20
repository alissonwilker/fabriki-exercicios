import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int x = entrada.nextInt();
		int y = 0;
		while (x != 0) {

			if (x > y) {
				y = x;
			} else if (x < 0 && x < y) {
				y = x;
			}
			x = entrada.nextInt();

		}
		saida.println("maior = " + y);
	}

}
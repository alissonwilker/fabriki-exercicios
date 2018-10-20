import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	static int maior = 0;

	public static void main(String[] args) {

		int num = entrada.nextInt();

		maior = num;

		if (num == 0) {
			System.out.println("maior = " + maior);
		} else {
			while (num != 0) {
				num = entrada.nextInt();
				if (num > maior && num != 0) {
					maior = num;
				} else {
					maior = maior;
				}
			}

			System.out.println("maior = " + maior);
		}
	}

}

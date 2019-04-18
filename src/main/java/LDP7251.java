import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		String i = entrada.next();
		int maior = Integer.parseInt(i);

		do {
			if (!i.equals("0")) {
				int j = entrada.nextInt();

				if (j != 0) {
					if (j > maior) {
						maior = j;
					}
					if (j == 0) {

						saida.println("maior = " + maior);

						// i = "0";
						break;
					}
				} else {
					saida.println("maior = " + maior);
				}
			} else {
				saida.println("maior = 0");
			}
		} while (!i.equals("0"));

	}

}

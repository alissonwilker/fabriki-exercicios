import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int cod = entrada.nextInt();
		int h = entrada.nextInt();
		int se = 0;
		int stt = 0;

		if (h < 50) {

			stt = h * 10;

		}

		else {

			se = (h - 50) * 20;
			stt = 500 + se;
		}

		saida.println("codigo = " + cod);
		saida.println("salarioExcedente = " + se);
		saida.println("salarioTotal = " + stt);

	}
}


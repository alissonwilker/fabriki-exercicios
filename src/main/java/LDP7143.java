import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		int C = entrada.nextInt();
		int D = entrada.nextInt();

		int a2, b2, c2, d2;

		a2 = A * A;
		b2 = B * B;
		c2 = C * C;
		d2 = D * D;

		if (c2 >= 10000) {
			saida.println("c2 = " + c2);
		} else {
			saida.println("a = " + A);
			saida.println("b = " + B);
			saida.println("c = " + C);
			saida.println("d = " + D);
			saida.println("a2 = " + a2);
			saida.println("b2 = " + b2);
			saida.println("c2 = " + c2);
			saida.println("d2 = " + d2);

		}

	}

}

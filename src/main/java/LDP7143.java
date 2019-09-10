import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, a2, b2, c2, d2;

		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();

		a2 = a * a;
		b2 = b * b;
		c2 = c * c;
		d2 = d * d;

		if (c2 >= 1000) {
			saida.println("c2 = " + c2);
		} else {
			saida.println("a = " + a);
			saida.println("b = " + b);
			saida.println("c = " + c);
			saida.println("d = " + d);
			saida.println("a2 = " + a2);
			saida.println("b2 = " + b2);
			saida.println("c2 = " + c2);
			saida.println("d3 = " + d2);
		}

	}

}

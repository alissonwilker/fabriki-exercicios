import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		int a2 = a * a;
		int b2 = b * b;
		int c2 = c * c;
		int d2 = d * d;
		if (c2 >= 1000) {
			System.out.println("c2 = " + c2);
		} else {
			saida.println("a = " + a);
			saida.println("b = " + b);
			saida.println("c = " + c);
			saida.println("d = " + d);
			saida.println("a2 = " + a2);
			saida.println("b2 = " + b2);
			saida.println("c2 = " + c2);
			saida.println("d2 = " + d2);
		}
	}
}
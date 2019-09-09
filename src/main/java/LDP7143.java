import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int n1, n2, n3, n4;
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();
		n4 = entrada.nextInt();

		int N1 = n1 * n1;
		int N2 = n2 * n2;
		int N3 = n3 * n3;
		int N4 = n4 * n4;

		if (n3 >= 1000) {
			saida.println("C2 - " + n3);
		} else {
			saida.println("a = 1" + "a = 1" + n1 + "b = 2 = " + n2 + "c = 3 =  " + n3 + "d = 4 =" + n4 + "a2 = 1 =" + N1
					+ "b2 = 4 =" + N2 + "c2 = 9 =" + N3 + "d2 = 1 =6" + N4);
		}
	}
}

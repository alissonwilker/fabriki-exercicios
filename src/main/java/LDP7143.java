import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		double a = entrada.nextInt();
		double b = entrada.nextInt();
		double c = entrada.nextInt();
		double d = entrada.nextInt();
		double a2 = Math.pow(a,2);
		double b2 = Math.pow(b,2);
		double c2 = Math.pow(c,2);
		double d2 = Math.pow(d,2);
		if (c2 >= 100) {
			saida.println(c2);
		} else {
			saida.println("a = "+a+"b = "+b+"c = "+c+"d = "+d+"a2 = "+a2+"b2 = "+b2+"c2 = "+c2+"d2 = "+d2);
		
		}

	}
}

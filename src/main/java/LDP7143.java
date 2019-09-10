import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		double a = entrada.nextInt();
		int aa = (int)a;
		double b = entrada.nextInt();
		int bb = (int)b;
		double c = entrada.nextInt();
		int cc = (int)c;
		double d = entrada.nextInt();
		int dd = (int)d;
		double a2 = Math.pow(aa,2);
		int aa2 = (int)a2;
		double b2 = Math.pow(bb,2);
		int bb2 = (int)b2;
		double c2 = Math.pow(cc,2);
		int cc2 = (int)c2;
		double d2 = Math.pow(dd,2);
		int dd2 = (int)d2;
		if (cc2 >= 1000) {
			saida.println(cc2);
		} else {
			saida.println("a = "+aa+"\nb = "+bb+"\nc = "+cc+"\nd = "+dd+"\na2 = "+aa2+"\nb2 = "+bb2+"\nc2 = "+cc2+"\nd2 = "+dd2);
		
		}

	}
}

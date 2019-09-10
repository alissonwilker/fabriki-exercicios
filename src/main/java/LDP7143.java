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

		int a2 = a*a; 
		int b2 = b*b;
		int c2 = c*c;
		int d2 = d*d;

		saida.println((c2 >= 1000) ? "c2 = "+ c2 : "a = "+a+"\nb = "+b+"\nc = "+c+"\nd = "+d+"\na2 = "+a2+"\nb2 = "+b2+"\nc2 = "+c2+"\nd2 = "+d2);
			
	}
}

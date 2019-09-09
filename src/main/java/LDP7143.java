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
		
		if (c*c>=1000) {
			saida.println("c2 = " + (c*c));
			
		} else {
			saida.println("a = " + a);
			saida.println("b = " + b);
			saida.println("c = " + c);
			saida.println("d = " + d);
			saida.println("a2 = " + (a*a));
			saida.println("b2 = " + (b*b));
			saida.println("c2 = " + (c*c));
			saida.println("d2 = " + (d*d));
		}
	}

}

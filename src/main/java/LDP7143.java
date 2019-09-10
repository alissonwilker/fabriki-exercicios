import java.util.Scanner;
import java.io.PrintStream;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int a,b,c,d;
		
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		
		int a2 = a*a;
		int b2 = b*b;
		int c2 = c*c;
		int d2 = d*d;
		
		if (c2 >= 1000) {
			saida.println("c2 = "+c2);
		}else {
			saida.println("a = "+a);
			saida.println("b = "+b);
			saida.println("c = "+c);
			saida.println("d = "+d);
			saida.println("a2 = "+a2);
			saida.println("b2 = "+b2);
			saida.println("c2 = "+c2);
			saida.println("d2 = "+d2);
		}

	}

}

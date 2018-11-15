import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	private static Scanner entrada1 = new Scanner(System.in);
	private static PrintStream saida1 = System.out;
	private static Scanner entrada2 = new Scanner(System.in);
	private static PrintStream saida2 = System.out;
	private static Scanner entrada3 = new Scanner(System.in);
	private static PrintStream saida3 = System.out;

	
	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int a2=0;
		int b2=0;
		int c2=0;
		int d2=0;
		
		a = entrada.nextInt();
		b = entrada1.nextInt();
		c = entrada2.nextInt();
		d = entrada3.nextInt();
		
		a2 = a*a;
		b2 = b*b;
		c2 = c*c;
		d2 = d*d;
		
		if(c2>999) {
			saida.println("c2 = " +c2);
		}else {
			saida.println("a2 = " +a2);
			saida1.println("b2 = " +b2);
			saida2.println("c2 = " +c2);
			saida3.println("d2 = " +d2);
		}

	}

}

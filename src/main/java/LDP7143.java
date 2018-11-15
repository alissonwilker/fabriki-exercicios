import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
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
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		
		a2 = a*a;
		b2 = b*b;
		c2 = c*c;
		d2 = d*d;
		
		if(c2>=1000) {
			saida.println("c2 = " +c2);
		}else {
			saida.println("a2 = " +a2);
			saida.println("b2 = " +b2);
			saida.println("c2 = " +c2);
			saida.println("d2 = " +d2);
		}

	}

}

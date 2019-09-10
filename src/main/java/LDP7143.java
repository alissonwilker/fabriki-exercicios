import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {

	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main (String[]args) {
		
		//DECLARAÇÃO
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		
		//PROCESSAMENTO
		int a2 = a*a;
		int b2 = b*b;
		int c2 = c*c;
		int d2 = d*d;
		
		//SAÍDA
		System.out.print((c2 >= 1000) ? "c2 = " + c2 : 
			"a = " + a + "\n"  
			+ "b = " + b + "\n"
			+ "c = " + c + "\n"
			+ "d = " + d + "\n"
			+ "a2 = " + a2 + "\n" 
			+ "b2 = " + b2 + "\n" 
			+ "c2 = " + c2 + "\n"
			+ "d2 = " + d2);		
	}
}

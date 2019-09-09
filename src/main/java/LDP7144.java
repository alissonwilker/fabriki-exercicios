import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main (String[]args) {
		
		int n = entrada.nextInt();
		
        String pn = (n<0) ? "NEGATIVO" : "POSITIVO";
        String pi = (n%2==0) ? "PAR" : "ÍMPAR";
        
		
		System.out.println(pi + " E " + pn);
			
		}
		
	}

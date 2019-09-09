import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main (String[]args) {
		
		int n = entrada.nextInt();
		
		if(n<0) {
			if (n%2==0) {
				saida.println("PAR E NEGATIVO");
			}else {
				saida.println("IMPAR E NEGATIVO");
			}
		}else {
			if (n%2==0) {
				saida.println("PAR E POSITIVO");
				}else {
				saida.println("IMPAR E POSITIVO");
				}
		}
		
		
	}

}

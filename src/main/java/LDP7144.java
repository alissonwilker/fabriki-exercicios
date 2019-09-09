import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static PrintStream saida = System.out;
	private static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		if (num % 2 == 0 && num >= 0) {
            saida.println("PAR E POSITIVO");
           }
        if (num % 2 == 0 && num < 0) {
            	saida.println("PAR E NEGATIVO");
           }
        if (num % 2 != 0 && num >= 0) {
            	saida.println("ÍMPAR E POSITIVO");
           }
        if (num % 2 != 0 && num < 0) {
            	saida.println("ÍMPAR E NEGATIVO");
			
		}
		
	}
}

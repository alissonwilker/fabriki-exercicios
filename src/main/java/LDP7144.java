import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int A = entrada.nextInt();
		
		if (A>=0) {
			if (A%2==0) {
				saida.println("PAR E POSITIVO");
			}
			else {
				saida.println("ÍMPAR E POSITIVO");				
			}
			
				}
		else {
			if (A%2==0) {
				saida.println("PAR E NEGATIVO");
			}
			else {
				saida.println("ÍMPAR E NEGATIVO");				
			}
						
				
		}

	}

}

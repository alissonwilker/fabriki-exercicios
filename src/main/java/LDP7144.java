import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		int n1;
		n1 = entrada.nextInt();
		
		if (n1 % 2 == 0) {
			if (n1 >= 0) {
				saida.println("PAR E POSITIVO");
			} else {
				saida.println("PAR E NEGATIVO");
			}	
			}else {
				if (n1 >= 0) {
				saida.println("ÍMPAR E POSITIVO");	
			} else {
				saida.println("ÍMPAR E NEGATIVO");
			}
		}
	}
}

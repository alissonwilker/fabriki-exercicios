import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		
		int num = entrada.nextInt();
		if (num % 2 == 0) {
			if (num >= 0) {
			saida.println("PAR E POSITIVO");
					} else {
					saida.println("PAR E NEGATIVO");
		}
			}
		if (num % 2 != 0) {
			if (num > 0) {
			saida.println("ÍMPAR E POSITIVO");
					} else {
			saida.println("ÍMPAR E NEGATIVO");
					}
		}
	}
}
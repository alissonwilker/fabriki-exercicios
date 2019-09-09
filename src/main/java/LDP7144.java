import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		int n1;
		n1 = entrada.nextInt();
		
		saida.println((n1 % 2 == 0? "PAR":"IMPAR"+ " E ") + (n1 >= 0? "POSITIVO" : "NEGATIVO"));
	}
}

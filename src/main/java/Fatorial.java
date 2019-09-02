import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		BigInteger fatorial = BigInteger.valueOf(1);
		int numero = entrada.nextInt();
		
		
		for(int i = numero ; i >= 1 ; i--) {
			
			fatorial = fatorial.multiply(BigInteger.valueOf(i));
			
		}
		saida.println(fatorial);

	}

}

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {		
		BigInteger fatorial = new BigInteger("1");		
		int numero = entrada.nextInt();		
		while (numero < 0 || numero > 25) {
			numero = entrada.nextInt();
		}
		
		for (Integer i = 1; i <= numero; i++) {
			BigInteger valor = new BigInteger(i.toString());
			fatorial = fatorial.multiply(valor);
		}
		
		saida.println(fatorial);
	}
}

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;
public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger numero = new BigInteger("1", 10);
		int n = entrada.nextInt();
		for (int i = 1; i<=n; i++) {
			numero = numero.multiply( BigInteger.valueOf(i) );
		}
		saida.println(numero );
	}
}

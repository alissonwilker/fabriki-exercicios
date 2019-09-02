import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int numero;
		BigInteger fat = BigInteger.valueOf(1);
				
		numero=entrada.nextInt();
		
		for (int i = numero; i >=1; i--) {
			fat=fat.multiply(BigInteger.valueOf(i));
		}
		saida.println(fat);
	}

}

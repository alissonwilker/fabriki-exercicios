
import java.math.BigInteger;
import java.io.PrintStream;
import java.util.Scanner;

public class Fatorial {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int fatorial = entrada.nextInt();
		int[] array = new int[fatorial];
		BigInteger resultado = new BigInteger("1");
		
		for (int i = 1; i < array.length; i++) {
			array[i] = fatorial;
			BigInteger temp = BigInteger.valueOf(array[i]);
			resultado = resultado.multiply(temp);
			fatorial--;
		}
		
		System.out.println(resultado);
		
	}

}

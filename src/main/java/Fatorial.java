import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	private static BigInteger basicIterativeFactorial(int valor) {

		BigInteger indice = new BigInteger("1");
		for (int i = 1; i <= valor; i++) 
			
			indice = indice.multiply(BigInteger.valueOf(i));
			return indice;
		}
	

	public static void main(String[] args) {
		int valor;
		valor = entrada.nextInt();
	

	
		System.out.println(basicIterativeFactorial(valor));
		
	}
}




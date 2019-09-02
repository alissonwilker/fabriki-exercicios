import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial.java {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;

	
public static void main(String [] args) {
	BigInteger fatorial = BigInteger.valueOf(1);
	
	for (int contador = 1; contador <=25; contador++) {
		
		fatorial = fatorial.multiply(BigInteger.valueOf(contador));
		System.out.println(fatorial);
		

	}

}
}

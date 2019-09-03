import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	BigInteger mult = BigInteger.valueOf(1);
	int n,i;
	n = entrada.nextInt();
	i=n;
	
	for(i=n; i>=1;i--) {
		mult = mult.multiply(BigInteger.valueOf(i));
		
	}
	saida.println(mult);
		
		
		
	}

}

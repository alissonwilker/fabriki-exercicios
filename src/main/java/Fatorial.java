import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;						
	
	public static void main(String[] args) {
		int n;
		BigInteger f =BigInteger.valueOf(1);
		
		n = entrada.nextInt();
		for (int i = n;i >= 1 ; i--) {
			f = f.multiply(BigInteger.valueOf(i));			
		}
		System.out.println(f);
	}
	

}

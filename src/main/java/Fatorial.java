import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		
		int num; 
		BigInteger fatorial = new BigInteger("1");
		num = entrada.nextInt();
		
		if(num>0) {
			for (int i = 1; i <= num; i++) {
				fatorial = fatorial.multiply(new BigInteger(Integer.toString(i)));
			}
			System.out.println(fatorial);
		}if (num==0) {
			System.out.println(fatorial);
		}
	}
}

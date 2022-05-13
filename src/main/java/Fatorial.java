import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial1 {
	public static void main(String[] args) {
		BigInteger  factorial = BigInteger.ONE;
 		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		
		entrada.close();

		for (int i = 1; i <= n; i++) {
		factorial = factorial.multiply(BigInteger.valueOf(i));
		}			
			System.out.println(factorial);
		
}	
}

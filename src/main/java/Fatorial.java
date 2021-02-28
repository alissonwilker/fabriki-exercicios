import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, fat;
		Scanner entrada = new Scanner (System.in);
		numero = entrada.nextInt();
		
		if(numero >= 0 && numero <=25) {
			BigInteger factorial = BigInteger.ONE; 
		for (fat = 1; numero > 1; numero -- ) {
			factorial = factorial.multiply(BigInteger.valueOf(numero));
		}System.out.println(factorial);
		}
		}
		
		
	}

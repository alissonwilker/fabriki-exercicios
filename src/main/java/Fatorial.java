import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte valor;
		BigInteger fatorial = BigInteger.ONE;
		
		valor = entrada.nextByte();
		entrada.close();
		
		for (byte i = 2; i <= valor; i++) {
			fatorial = fatorial.multiply(BigInteger.valueOf(i) );
		
		}
		
		System.out.println(fatorial);
	}

}

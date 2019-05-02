import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);

		BigInteger fatorial = new BigInteger("1");
		BigInteger ac = new BigInteger("1");
		BigInteger ponto = new BigInteger("1");
		
		int numero = 0;
		numero = entrada.nextInt();
		
		for (int cont = 1; cont <= numero; cont++) {
			
			fatorial = fatorial.multiply(ac);
			ac = ac.add(ponto);
		}
		
		System.out.println(fatorial);
	}
}

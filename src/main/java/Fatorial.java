import java.util.Scanner;
import java.math.BigInteger;
public class Fatorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		
		long fatorial = 1;
		int i =1;
		
		
		while(i<= numero&&numero>0&& numero<=25) {
			
			fatorial = fatorial*i;
			i++;
			
		}
		
		System.out.println(fatorial);
	}
}

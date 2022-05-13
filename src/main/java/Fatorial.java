import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	int numero = entrada.nextInt();
    	BigInteger fatorial = BigInteger.valueOf(numero);
    	if (numero == 0) {
    		System.out.println(1);
    	}
    	else {
    	for(int x = 1; x < numero; x++){
    		 fatorial = fatorial.multiply(BigInteger.valueOf(x));
        }
    	 System.out.println(fatorial);
    }
    }
}

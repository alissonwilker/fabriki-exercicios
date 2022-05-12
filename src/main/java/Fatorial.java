import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	int numero = entrada.nextInt();
    	BigInteger fatorial = BigInteger.valueOf(numero);
    	for(int x = numero - 1; x >= 1; x--){
    		 fatorial = fatorial.multiply(BigInteger.valueOf(x));
        }
    	 System.out.println(fatorial);
    }
}

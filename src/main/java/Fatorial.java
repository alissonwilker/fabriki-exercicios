import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);

	    
//        int fat = 1;
        BigInteger fat = BigInteger.ONE;
        int valor = entrada.nextInt(); //ou qualquer outro valor que queira calcular;

        for( int i = 2; i <= valor; i++ )
        {
            fat = fat.multiply(BigInteger.valueOf(i));
        }

        System.out.println( "O fatorial de " + valor + " é igual a " + fat );
	}
}

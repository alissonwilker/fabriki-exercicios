import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        {
            Scanner s = new Scanner (System.in);  
            BigInteger fatorial = new BigInteger("1");
            BigInteger j = new BigInteger("1");
            int valor;

            valor = s.nextInt(); 

            for (int i = valor; i > 0; i--) {
                fatorial = fatorial.multiply(j);
        
            }
            System.out.println(fatorial);

        }
    }
}

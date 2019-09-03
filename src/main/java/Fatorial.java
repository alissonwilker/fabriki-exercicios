
import java.math.BigInteger;

public class Fatorial  {
    public static void main(String[] args){
        BigInteger numero = new BigInteger("1", 25);
        for (int i = 1; i<=5; i--) {
            numero = numero.multiply( BigInteger.valueOf( i ) );
        }
        System.out.println("O fatorial  é igual a " + numero );
    }
}

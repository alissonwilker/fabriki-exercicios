import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        BigInteger entrada = scanner.nextBigInteger();
        BigInteger fatorial = new BigInteger("1");
        while (entrada.compareTo(BigInteger.ZERO) != 0) {
            fatorial = fatorial.multiply(entrada);
            entrada = entrada.subtract(new BigInteger("1"));
            //cont = entrada.intValue();
        }

        System.out.println(fatorial);
    }
}

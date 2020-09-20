import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        long n = 0;
        BigInteger fatorial = new BigInteger("1");

        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();

        if ((n >= 0) & (n <= 25)) {
            while (n > 1) {
                fatorial = fatorial.multiply(BigInteger.valueOf(n));
                n = n - 1;
            }
            System.out.println(fatorial);
        }

    }
}

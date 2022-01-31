import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int factor, index;
        BigInteger factorial = BigInteger.valueOf(1);

        factor = input.nextInt();

        for(index = 1; index <= factor; index++) {
            factorial = factorial.multiply(BigInteger.valueOf(index));
        };

        System.out.println(factorial);
    }
}

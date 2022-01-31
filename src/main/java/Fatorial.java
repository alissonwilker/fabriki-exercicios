import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num, i;
        BigInteger result = BigInteger.valueOf(1);

        num = input.nextInt();

        for(i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        };

        System.out.println(result);
    }
}

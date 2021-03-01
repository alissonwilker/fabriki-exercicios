import java.math.BigInteger;
import java.util.Scanner;
public class Fatorial{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num = 1;
        num = ent.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
        }
}

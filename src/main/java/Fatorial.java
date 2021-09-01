import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        byte n1 = entrada.nextByte();
        entrada.close();
        BigInteger fat = BigInteger.ONE;

        for (int i = 2; i <= n1; i++) {
            fat = fat.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fat);
    }
}

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class LDP7252 {

    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {

        BigInteger mat[] = new BigInteger[64];
        mat[0] = new BigInteger("1");

        BigInteger soma = new BigInteger("1");

        for (int j = 1; j <= 63; j++) {
            mat[j] = mat[j - 1].multiply(new BigInteger("2"));
            soma = soma.add(mat[j]);

        }
        System.out.println("totalGraos = " + soma);

    }

}

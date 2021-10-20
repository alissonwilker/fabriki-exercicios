import java.math.BigInteger;

public class LDP7252 {
    public static void main (String[] args) {
        BigInteger qtdGraos = BigInteger.valueOf(1);
        for (int i=0; i<64; i++) {
            qtdGraos = qtdGraos.multiply(BigInteger.valueOf(2));
        }
        System.out.println("totalGraos = "+qtdGraos);
    }
}

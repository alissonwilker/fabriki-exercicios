import java.math.BigInteger;

public class LDP7252 {

    public static void main(String[] args) {

        BigInteger Dois = new BigInteger("2");

        BigInteger totalGraos = Dois.pow(64).subtract(BigInteger.ONE);
        System.out.println("totalGraos = " + totalGraos);

    }

}

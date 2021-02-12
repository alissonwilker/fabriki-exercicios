import java.math.BigInteger;

public class LDP7252 {
    public static void main(String[] args){
        BigInteger bigIntegersum = new BigInteger("0");
        BigInteger bigIntegergraos = new BigInteger("1");
        BigInteger dois = new BigInteger("2");

        for (int i = 0; i < 64 ; i++){
            bigIntegersum = bigIntegersum.add(bigIntegergraos);
            bigIntegergraos = bigIntegergraos.multiply(dois);
        }
        System.out.println("totalGraos = " + bigIntegersum);
    }
}

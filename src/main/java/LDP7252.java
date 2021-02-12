import java.math.BigInteger;

public class LDP7252 {
    public static void main(String[] args){
        long graos = 1;
        long sum = 0;
        BigInteger bigInteger = new BigInteger("0");

        for (int i = 0; i < 64 ; i++){
            sum += graos;
            bigInteger = bigInteger.add(BigInteger.valueOf(sum));
            graos *= 2;
        }
        System.out.println("totalGraos = " + bigInteger);
    }
}


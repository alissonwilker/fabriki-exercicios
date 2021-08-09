import java.math.BigInteger;

public class LDP7252{

   public static void main(String[] args) {

       BigInteger num = new BigInteger("1");
       BigInteger dois = new BigInteger("2");

       for (int i = 0; i < 64; i++) {
           num = num.multiply(dois);
       }

       System.out.println("totalGraos = "+num);
   }
}

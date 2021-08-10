import java.math.BigInteger;

public class LDP7252 {
          public static void main(String[] args) {
                     BigInteger graosDeTrigo = new BigInteger("1");
                     BigInteger somatorio = new BigInteger("0");
                           somatorio.add(graosDeTrigo); 
                           for (int i = 1 ; i <= 63;i++)  {
                             graosDeTrigo = graosDeTrigo.multiply(new BigInteger("2"));
                             somatorio = somatorio.add(graosDeTrigo);
                     }
                    System.out.println("totalGraos = " +somatorio.add(new BigInteger("1")));
              }
      }
                     

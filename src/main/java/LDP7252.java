import java.math.BigInteger;

public class LDP7252{

          public static void main(String[] args) {
                     BigInteger sub = new BigInteger ("- 1") ;
                     BigInteger grao = new BigInteger ("1") ;
                     BigInteger mult = new BigInteger ("2") ;

                     for (int i = 0 ; i < 64 ; i++)  {
                             grao = grao.multiply(mult);
                     }

                    grao = grao.add(sub);
                    System.out.println( "totalGraos = "+grao) ;

              }

      }
                     

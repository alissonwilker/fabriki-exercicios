import java.math.BigInteger;

public class LDP7252 {

          public static void main(String[] args) {
                     BigInteger graos = new BigInteger (" 1 ") ;
                     BigInteger soma = new BigInteger (" 0 ") ;
                           soma.add(graos); 
                           for (int i = 0 ; i < = 63 ; i++)  {
                             graos = graos.multiply(new BigInteger("2")) ;
                             soma = soma.add (graos);
                     }

                  
                    System.out.println( "totalGraos = "+soma.add(new BigInteger("1"))) ;

              }

      }
                     

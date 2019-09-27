import java.io.PrintStream;
import java.math.BigInteger;


public class LDP7252 {
    private static PrintStream saida = System.out;

    public static void main(String[] args) {
    BigInteger matriz[][] = new BigInteger[8][8];

    BigInteger inicial = BigInteger.valueOf(1);

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
          
          inicial = inicial.multiply(BigInteger.valueOf(2));

          matriz[7][7] = inicial;
          
          saida.println(matriz[7][7]);
      }
      
    }
    
}
}

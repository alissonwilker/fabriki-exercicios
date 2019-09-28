import java.io.PrintStream;
import java.math.BigInteger;


public class LDP7252 {
    private static PrintStream saida = System.out;

    public static void main(String[] args) {
    BigInteger matriz[][] = new BigInteger[8][8];
    BigInteger soma = BigInteger.valueOf(0);

    BigInteger inicial = BigInteger.valueOf(1);

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
          matriz[i][j] = inicial;
          inicial = inicial.multiply(BigInteger.valueOf(2));      
          soma = soma.add(matriz[i][j]);
      }  
    }
    saida.println("totalGraos = " + soma);
}

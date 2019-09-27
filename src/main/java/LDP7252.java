import java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {
    private static PrintStream saida = System.out;

    public static void main(String[] args) {

        BigInteger[] xadrez = new BigInteger[64];
        xadrez[0]=BigInteger.valueOf(1);
        
        for (int i = 1; i <= 63; i++) {
            
            xadrez[i] = (xadrez[i-1].multiply(BigInteger.valueOf(2)));
        }
saida.println("talGraos = "+xadrez[63]);    
    }
    
}

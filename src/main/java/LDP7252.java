
Ruan Mateus
30 de jun. de 2022 20:50 (há 4 dias)
para mim

import java.math.BigInteger;

public class LDP7252{
    public static void main(String[] args) {
        BigInteger grao = BigInteger.valueOf(1);
        BigInteger totalGraos = BigInteger.valueOf(0);

        for (int i=1; i<=64; i++) {
            totalGraos = totalGraos.add(grao);
            grao = grao.multiply(BigInteger.valueOf(2));
        }  
        System.out.println ("totalGraos = " + totalGraos);    
    }
}

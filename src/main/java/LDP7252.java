import java.math.BigDecimal;

public class LDP7252 {
    public static void main (String args[]){
        BigDecimal soma = BigDecimal.ZERO;
        BigDecimal dois = new BigDecimal(2);

        for (int i = 0; i <= 63; i++) {
    
            soma = soma.add(dois.pow(i));
    
        }
        System.out.println("totalGraos = "+soma);
    }
}

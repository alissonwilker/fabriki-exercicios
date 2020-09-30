import java.math.BigDecimal;  

public class LDP7252{  

    public static void main(String[] args) {  

        BigDecimal bgd = new BigDecimal(2);
        BigDecimal soma = BigDecimal.ZERO;  

        for (int i = 0; i <= 63; i++) {  

            soma = soma.add(bgd.pow(i));  

        }  

        System.out.println("totalGraos = " + soma);  

    }  

} 

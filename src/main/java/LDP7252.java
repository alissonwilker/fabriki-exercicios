import java.math.BigDecimal;
public class LDP7252 {

    public static void main(String[] args) {
        BigDecimal DOIS = new BigDecimal(2);
        BigDecimal soma = BigDecimal.ZERO;  
      
        for (int i = 0; i <= 63; i++) {  
      
            soma = soma.add(DOIS.pow(i));  
      
        }  
      
        System.out.println("totalGraos = "+soma);  
    }
    
}

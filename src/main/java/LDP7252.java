import java.math.BigDecimal;

public class LDP7252 {

    public static void main(String[] args) {
         
        BigDecimal totalGraos= new BigDecimal(2);
        
        for (int i = 1; i < 64; i++) {
          totalGraos = totalGraos.multiply(new BigDecimal(2)); 
        }
        
        totalGraos = totalGraos.subtract(new BigDecimal(1));
              
        System.out.println("totalGraos = " + totalGraos);
                    
    }
}

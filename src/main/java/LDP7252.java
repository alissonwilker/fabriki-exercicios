import java.math.BigDecimal;
public class LDP7252 {

    public static void main(String[] args) {
         
        BigDecimal totalGraos= new BigDecimal(0);
      
        totalGraos = new BigDecimal((Math.pow(2, 64)));
        totalGraos = totalGraos.subtract(new BigDecimal(1));
        
        System.out.println("totalGraos = " + totalGraos);

            
    }
}

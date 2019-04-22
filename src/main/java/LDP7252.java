import java.math.BigDecimal;

/**
 *
 * @author Aluno
 */
public class LDP7252 {

    public static void main(String[] args) {
        BigDecimal cont = new BigDecimal(2);
        BigDecimal graos = BigDecimal.ZERO;  
        for (int i = 0; i <= 63; i++) {  
            graos = graos.add(cont.pow(i));  
        }  
        System.out.println("totalGraos = "+graos);  
    }  
}

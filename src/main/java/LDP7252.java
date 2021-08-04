import java.math.BigDecimal;

public class LDP7252{

    public static void main(String[] args) {


        int i;
        double totalGraos =1;
        double inicio = 1;


        for(i = 2; i <= 64; i++){
            inicio = inicio * 2;
            totalGraos += inicio;

        }

        BigDecimal somatorio = BigDecimal.valueOf(totalGraos);
        System.out.println("totalGraos = "+ somatorio.toBigInteger());


    }
}

import java.math.BigDecimal;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        BigDecimal fatorial = new BigDecimal(numero);

        if (numero == 0) {
            fatorial = new BigDecimal(1);
        } else {
            for (int i = numero; i > 1; i--) {
                fatorial = fatorial.multiply(new BigDecimal(i - 1));
            }
        }
        System.out.println(fatorial);

    }
}

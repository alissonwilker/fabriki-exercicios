
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        int n = 0;
        int fatorial = 1;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if ((n >= 0) & (n <= 25)) {
            while (n > 1) {
                fatorial = n * fatorial;
                n = n - 1;
            }
            System.out.println(""+fatorial);
        }

    }
}

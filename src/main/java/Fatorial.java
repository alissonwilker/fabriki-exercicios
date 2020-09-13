import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fatorial = scanner.nextInt();
        
        if (fatorial == 0) {
            fatorial = 1;
        } else {
            for (int i = fatorial; i > 1; i--) {
                fatorial *= (i - 1);
            }
        }
        System.out.println(fatorial);
    }
}

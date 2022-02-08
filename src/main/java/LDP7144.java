import java.util.Scanner;

public class LDP7144 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        number = s.nextInt();

        if(number % 2 == 0) {
            if(number > 0) {
                System.out.println("PAR E POSITIVO");
            }
            else {
                System.out.println("PAR E NEGATIVO");
            }
        } else {
            if(number < 0) {
                System.out.println("ÍMPAR E NEGATIVO");
            }
            else {
                System.out.println("ÍMPAR E POSITIVO");
            }
        }

    }
}

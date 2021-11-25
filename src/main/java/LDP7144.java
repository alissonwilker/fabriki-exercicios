import java.util.Scanner;
public class LDP7144 {
    public static void main() {
        int number;
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        if(number%2 == 0) {
            if(number > 0) {
                System.out.println("PAR E POSITIVO");
            }
            else {
                System.out.println("PAR E POSITIVO");
            }
        } else {
            if(number < 0) {
                System.out.println("PAR E NEGATIVO");
            }
            else {
                System.out.println("PAR E NEGATIVO");
            }
        }
    }
}

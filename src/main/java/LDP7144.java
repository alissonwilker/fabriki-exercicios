import java.util.Scanner;

public class LDP7144 {

    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
    int number;
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

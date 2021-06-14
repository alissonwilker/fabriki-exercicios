import java.util.Scanner;

public class LDP7144 {
    public static void main(String[ ] args) {

        Scanner Numeros = new Scanner(System.in);
        int n1 = Numeros.nextInt();

        if (n1 % 2 == 0 && n1 >= 0) {
            System.out.println("PAR E POSITIVO");
        } else if (n1 % 2 != 0 && n1 >= 0) {
            System.out.println("ÍMPAR E POSITIVO");

        } else if (n1 % 2 ==0 && n1 < 0) {
            System.out.println("PAR E NEGATIVO");

        } else if (n1 % 2 != 0 && n1 < 0) {
            System.out.println("ÍMPAR E NEGATIVO");
        }
    }
}

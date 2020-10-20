import java.util.Scanner;

public class LDP7141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P; int EX; int M;

        P = scanner.nextInt();

        EX = (P-50);

        M = (EX * 4);

        
        System.out.println("exedente = " + EX);
        System.out.println("multa = " + M);
    }
}

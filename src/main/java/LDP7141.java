import java.util.Scanner;

public class LDP7141 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initialValue, excess = 0, fine = 0;

        initialValue = input.nextInt();

        if (initialValue > 50) {
            excess = initialValue - 50;
            fine = excess * 4;
        }

        System.out.println("excedente = " + excess);
        System.out.println("multa = " + fine);
    }
}

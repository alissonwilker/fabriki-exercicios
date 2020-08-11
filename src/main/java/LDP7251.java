import java.util.Scanner;

public class LDP7251 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int n;

        do {
            n = scanner.nextInt();

            if (n > maior) {
                maior = n;
            }
        } while(n != 0);

        System.out.println("maior = " + maior);
    }
}

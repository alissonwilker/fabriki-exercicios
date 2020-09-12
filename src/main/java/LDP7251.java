import java.util.Scanner;

public class LDP7251 {

    public static void main(String[] args) {       
        int maior = 0;

        int num = 0;

        Scanner sc = new Scanner(System.in);

        do {
            num = sc.nextInt();

            if (num < 0 & maior == 0) {
                maior = num;
            }

            if (num > maior & num != 0) {
                maior = num;
            }
        } while (num != 0);

        System.out.println("maior = " + maior);
               
    }
}

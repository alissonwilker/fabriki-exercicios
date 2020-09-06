import java.util.Scanner;
public class LDP7251 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maior = -2147483648;
        int numero = scanner.nextInt();

        if (numero == 0) {
            maior = 0;
        } else {
            do {
                numero = scanner.nextInt();
                if (numero == 0) {
                    break;
                } else {
                    if (numero >= maior) {
                        maior = numero;
                    }
                }
            } while (numero != 0);
        }
        System.out.println("maior = "+maior);

    }
}

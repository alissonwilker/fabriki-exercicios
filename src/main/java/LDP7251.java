import java.util.Scanner;

public class LDP7251 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada, maior;
        maior = entrada = Integer.parseInt(scanner.next());
        while (entrada != 0) {
        if (entrada > maior)
            maior = entrada;
        entrada = Integer.parseInt(scanner.next());
        }
        System.out.println("maior = "+maior);
    }
}

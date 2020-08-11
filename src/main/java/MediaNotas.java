import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

        formatador.setMinimumFractionDigits(1);

        formatador.setMaximumFractionDigits(1);

        int n = scanner.nextInt();

        int[] notas = new int[n];
        int soma = 0;

        for (int i = 0; i < n; ++i) {
            notas[i] = scanner.nextInt();
            soma += notas[i];
        }

        double media = (double)soma / n;
        System.out.println("media = " + formatador.format(media));

        for (int i = 0; i < n; ++i) {
            System.out.println("nota " + (i + 1)  + " = " + formatador.format(notas[i]));
        }
    }
}

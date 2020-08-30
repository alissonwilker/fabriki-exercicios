import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        int qtNotas = scanner.nextInt();

        double notas [] = new double[qtNotas];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
        }
        double somaNotas = 0;

        for (int i = 0; i < qtNotas; i++) {
            somaNotas += notas[i];
        }

        double media = somaNotas / qtNotas;

        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);

        System.out.println(formatador.format(media));

        for (int i = 0; i < qtNotas; i++) {
            
            System.out.println(formatador.format(notas[i]));

        }
    }
}


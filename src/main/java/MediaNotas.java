import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {
        int qtdeNotas = entrada.nextInt();
        int[] notas = new int[qtdeNotas];

        double soma = 0;
        for (int i = 0; i < qtdeNotas; i++) {
            notas[i] = entrada.nextInt();
            soma += notas[i];
        }

        double media = soma / qtdeNotas;

        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);

        saida.println("media = " + formatador.format(media));
        for (int i = 0; i < notas.length; i++) {
            saida.println("nota " + (i + 1) + " = " + formatador.format(notas[i]));
        }
    }
}

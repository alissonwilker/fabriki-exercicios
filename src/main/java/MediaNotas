import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Scanner;

public class MediaNotas {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {
        int qtdeAlunos = entrada.nextInt();
        int[] notas = new int[qtdeAlunos];

        double soma = 0;
        for (int i = 0; i < qtdeAlunos; i++) {
            notas[i] = entrada.nextInt();
            soma += notas[i];
        }

        double media = soma / qtdeAlunos;

        NumberFormat formatador = NumberFormat.getInstance();
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);

        saida.println("media = " + formatador.format(media));
        for (int i = 0; i < notas.length; i++) {
            saida.println("nota " + (i + 1) + " = " + formatador.format(notas[i]));
        }
    }
}

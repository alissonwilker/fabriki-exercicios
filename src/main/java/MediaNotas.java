import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdNotas = 0;
        double somaNotas = 0;
        qtdNotas = Integer.parseInt(scanner.next());
        if (qtdNotas > 0) {
            int[] notas = new int[qtdNotas];
            for (int i=0; i<qtdNotas; i++) {
                notas[i] = Integer.parseInt(scanner.next());
                somaNotas += notas[i];
            }
            NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
            formatador.setMinimumFractionDigits(1);
            formatador.setMaximumFractionDigits(1);
            System.out.println("media = " + formatador.format(somaNotas/qtdNotas));
            for (int i=0; i<qtdNotas; i++) {
                System.out.println("nota "+(i+1)+" = "+formatador.format(notas[i]));
            }
        }
    }
}

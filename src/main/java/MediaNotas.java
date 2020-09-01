import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String args[]) {
        Scanner nota = new Scanner(System.in);

        double qntNotas = nota.nextDouble();

        double notas[] = new double[(int) qntNotas];
        double soma = 0;

        for (int i = 0; i < qntNotas; i++) {
            notas[i] = nota.nextDouble();
            soma = soma + notas[i];
        }

        double media = soma / qntNotas;
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);
        System.out.println("media = " + formatador.format(media));
        for (int i = 0; i <= notas.length; i++) {
            System.out.println("nota " + i + " = " + notas[i]);
        }
        nota.close();

    }

}

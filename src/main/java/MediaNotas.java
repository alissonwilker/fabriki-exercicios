import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);

        int qtdNota;
        qtdNota = sc.nextInt();

        int[] nota = new int[qtdNota];
        double media;
        double soma = 0;



        for (int i = 0;i<qtdNota;i++){
            nota[i] = sc.nextInt();
            soma += nota[i];
        }
        media = soma/qtdNota;

        System.out.println("media = " + formatador.format(media));
        for(int j = 0; j<qtdNota;j++){
            System.out.println("nota " + (j + 1) + " = " + formatador.format(nota[j]));
        }
    }
}


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int qtdeNotas = scanner.nextInt();

        List<Integer> notas = new ArrayList<>();

        
        double media = 0;
        for (int i = 0; i < qtdeNotas; i++) {
            notas.add(scanner.nextInt());
            media += notas.get(i);
        }

        media /= qtdeNotas;

        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);
        
        System.out.println("media = " + formatador.format(media));
        for (int i = 0; i < qtdeNotas; i++) {
            System.out.println("nota " + (i+1) + " = " + formatador.format(notas.get(i)));
        }

        
    }

}


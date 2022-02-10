import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class MediaNotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;;
        int notas[] = new int[num];

        for (int i = 0; i < num; i++) {
            notas[i] = scanner.nextInt();
            sum += notas[i];
        }

        double media = sum / (double) num;
        
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        
        formatador.setMinimumFractionDigits(1);
        
        formatador.setMaximumFractionDigits(1);
        
        System.out.println("media = " + formatador.format(media));

        for (int i = 0; i < num; i++) {
            System.out.println("nota " + (i + 1) + " = " + formatador.format(notas[i]));
        }
    }
}

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtNotas = scanner.nextInt();

        int notas [] = new int[qtNotas];

        for (int i = 0; i < qtNotas; i++) {
            notas[i] = scanner.nextInt();
        }
        
        double somaNotas = 0;
        
        for (int i = 0; i < qtNotas; i++) {
            somaNotas += notas[i];
        }
        double media = somaNotas / qtNotas;

        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);

        System.out.println("media = "+formatador.format(media));

        int a = 1;
        for (int i = 0; i < qtNotas; i++) {
            System.out.println("nota "+a+" = "+formatador.format(notas[i]));
            a += 1;    
        }      
    }
}

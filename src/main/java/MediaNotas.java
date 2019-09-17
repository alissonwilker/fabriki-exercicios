
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class MediaNotas {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    public static void main(String[] args) {
        
        int qtd = entrada.nextInt();
        int[] notas = new int[qtd];
        double soma=0;
        
        for (int i = 0; i < qtd; i++) {
            int n = entrada.nextInt();
            notas[i] = n;
            soma=soma+notas[i];
        }
        
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);
        double media = soma/qtd;
        saida.println("media = " + formatador.format(media));
        
        for (int i = 0; i < qtd; i++) {
            saida.println("nota "+(i+1)+" = " + formatador.format(notas[i]));
        }
    }
}

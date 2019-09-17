import java.io.PrintStream;
import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;
import java.text.NumberFormat;
import java.util.Locale;

public class MediaNotas {
    
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String args[]) {
    int n, nota, soma;
Vector v = new Vector();
    n = entrada.nextInt();
    soma = 0;
    for (int i =0; i<n; i++){ 
    
    nota= entrada.nextInt();
    soma= nota +soma;
    v.add(nota);
    }

    double media = soma / n;

    NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

    formatador.setMinimumFractionDigits(1);

    formatador.setMaximumFractionDigits(1);

    saida.println("media = " + formatador.format(media));
  Iterator it = v.iterator();
    int i = 1;
    while (it.hasNext()){ 
saida.println("nota " + i + " = " + formatador.format( it.next()));
    i++;
    }

}
}

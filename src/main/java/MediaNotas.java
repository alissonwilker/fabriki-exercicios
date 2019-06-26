import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class MediaNotas {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int qtdeNotas = teclado.nextInt();
    int[] nota = new int [qtdeNotas];
    double soma = 0;
    for (int i = 0; i < qtdeNotas; i++) {
        nota [i] = teclado.nextInt();
        soma = soma + nota [i];
    }

    double media = soma / qtdeNotas;
    NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
    formatador.setMinimumFractionDigits(1);
    formatador.setMaximumFractionDigits(1);
    System.out.println("media = " + formatador.format(media));
    for (int i = 0; i < qtdeNotas; i++) {
       System.out.println ("nota " + (i+1) + " = " + formatador.format(nota[i]));
    }
  }
}

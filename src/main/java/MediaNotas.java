import java.util.Scanner;
import java.text.NumberFormat;

public class MediaNotas{
    private static Scanner entrada = new Scanner(System.in);
    NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
    
    public static void main(String args[]) {
      int qtdeNotas, soma=0;
      int[] notas;
      double media = soma / qtdeNotas;
      
      qtdeNotas = entrada.nextInt();
      
        for(int i= 0; i< qtdeNotas; i++) {
        	notas[i] = entrada.nextInt();
        	soma += notas[i];
        }
      System.out.println("media = "+ media);
    }
}

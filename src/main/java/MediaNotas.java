import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas { 
                   private  static Scanner entrada = new Scanner(System.in);
                   private static NumberFormat formatador = 
                   NumberFormat.getInstance(new Locale("pt" , "BR"));

public static void main(String[] args) { 
                   int quantNotas = entrada.nextInt();
                   int i = 5;
                   int[] notas = new int[i];
                   int total = 0;

                   formatador.setMinimumFractionDigits(1);
                   formatador.setMaximumFractionDigits(1);

                  for(i=1 ; i<= quantNotas; i++) {
                                notas [i] = entrada.nextInt();
                                total += notas[i];
                  if(i == quantNotas) {
                                                double media = (double) total/ (double) quantNotas;
                                                System.out.println("média = "+formatador.format(media));
                  for(i = 1 ; i<= quantNotas ; i++) 
                                                 System.out.println("nota  "+ i + " = " + formatador.format(notas[i] ));

         }                     
      }                  
   }                       
}

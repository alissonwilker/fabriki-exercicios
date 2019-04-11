import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class MediaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);
        /*System.out.println("Digite quantidades de alunos");*/
        int a = s.nextInt();
        int nota[] = new int[a]; 
       /* System.out.println("Digite notas");*/
        
        for (int i = 0; i < a ; i++ ){
            int n = s.nextInt();
            nota[i] = n; 
            
        }
        double soma = 0;
        for (int i = 0 ; i < a; i++) {
            soma = soma + nota[i];         
        }
        double media = soma/a;
        System.out.println("media = " + formatador.format(media));
        for (int i = 0; i < a; i++) {
            System.out.println("nota " + (i+1) + " = " + formatador.format(nota[i]));
            
        }
        
     }
}

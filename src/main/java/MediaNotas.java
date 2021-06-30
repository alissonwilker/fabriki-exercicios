import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        double[] notas = new double[a]; 
        double n1;
        double n2=0;
        double media ;

        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);

        formatador.setMaximumFractionDigits(1);
       
        
        for(int i = 0;i<a;i++){
            n1 = leitor.nextInt();
            notas[i]=n1;
            n2+=n1;
        }
        media= n2/a;
        System.out.println("media = "+formatador.format(media));
        
        for(int i=0;i<notas.length;i++) {
        	System.out.println("nota "+(i+1)+" = "+formatador.format(notas[i]));
        }
        

    }
    
}

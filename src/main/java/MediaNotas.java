import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args) {
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

formatador.setMinimumFractionDigits(1);

formatador.setMaximumFractionDigits(1);
         Scanner leia = new Scanner (System.in);
        int not,i = 0,i2=0;
        double med =0;
        int n = leia.nextInt();
        
        double[] prova = new double[n];
        for(i=0;i<n;i++){
            int nota = leia.nextInt();
            prova[i]= nota;
            med += nota;
	}
        System.out.println("media = "+ formatador.format(med/n));
         for(i2=0;i2<n;i2++){
             System.out.println("nota "+(i2+1)+" = "+formatador.format(prova[i2]));
         
    }}}

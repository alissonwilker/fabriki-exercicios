import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MediaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        
        int n1,n2,n4;
        double n3=0;
        
        DecimalFormat df= new DecimalFormat("##.#");
        
        n1=tec.nextInt();
        
        for(int i=1;i<=n1;i++){
            n2=tec.nextInt();
            n3= (n3+n2)/i;
            
            System.out.println("nota "+i+" = "+n2);
            
        };
        
        
        
      
        System.out.println("media = "+df.format(n3));
        
        
    }
    
}

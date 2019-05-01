import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Fatorial{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Scanner s = new Scanner(System.in);
       BigInteger fatorial = new BigInteger("1");
       BigInteger j = new BigInteger("1");
       System.out.println("Diite valor Fatorial"); 
       
       int valor = s.nextInt();
       for (int i = valor; i > 0; i--) {
          fatorial = fatorial.multiply(j);
          j = j.add(new BigInteger("1"));
        }
        
        
        System.out.println(fatorial);      
    }
    
}

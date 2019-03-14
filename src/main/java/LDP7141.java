import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LDP7141  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int ex = 0;
       int mul = 0;
      int peso = sc.nextInt();
        if (peso > 50) {
              ex = peso - 50;
             mul = ex * 4;
        }
         System.out.println("exedente = " + ex);
          System.out.println("multa = " + mul);
        }
       }
        


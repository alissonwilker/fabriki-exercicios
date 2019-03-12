import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LDP7141 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int peso = Integer.parseInt(input.nextLine());
       int exedente = 0;
       int multa = 0;
        if (peso > 50) {
            exedente = peso - 50;
            multa = exedente * 4;
        }
        System.out.println("excedente = " + exedente);
         System.out.println("multa =  " + multa);
               
       
    }
    
}

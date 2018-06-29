import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author alufer
 */
public class LDP7141 {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        saida.print(" ");
       int KG = entrada.nextInt();
  if(KG > 50){
           int execesso = KG - 50;
           int multa = execesso * 4;
           saida.println("excedente="+execesso);
           saida.println("multa="+multa);
       }else{
           int multa = KG - 50;
           saida.println("excedente=0");
           saida.println("multa=0");
       }
    }
}

import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
   
    public static void main(String[] args) {
       saida.print(" ");
       int KG = entrada.nextInt();
       int aux = KG - 50;
       
       if(KG <= 50){
           saida.println("execedento=0");
           saida.println("multa=0");
       }else if(KG > 50) {
           int multa = KG - 50;
           saida.println("excedente="+multa);
           saida.println("multa="+multa*4);
       }
       
        
    }
    
}

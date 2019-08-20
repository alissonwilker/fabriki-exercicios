import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
    private static Scanner entrada= new Scanner (System.in); 
    private static PrintStream saida = System.out;
    public static void main(String[] args) {
         int kilo;
         int excedente;
         int multa;
        kilo=entrada.nextInt();
        if( kilo>50){
            excedente =kilo-50;
            multa= excedente*4;
            saida.println("exedente = " + excedente);
            saida.println("multa = "+multa);
            
        } else {
            
            saida.println("excedente = "+ 0);
            saida.println("multa = "+ 0);
        }
        
       
        
            
    }
    
}

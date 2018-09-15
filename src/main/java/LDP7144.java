import java.io.PrintStream;
import java.util.Scanner;


public class LDP7144 {

    private static final Scanner entrada = new Scanner(System.in);
    private static final PrintStream saida = System.out;

    public static void main(String[] args) {
        
        int num = entrada.nextInt();
        
        if ((num >= 0) && (num % 2 == 0)){
            saida.println("PAR E POSITIVO");
        }
            if ((num >= 0) && (num % 2 != 0)){
            saida.println("ÍMPAR E POSITIVO");
    }
           if ((num < 0) && (num % 2 == 0)){
           saida.println("PAR E NEGATIVO"); 
           }
        
        if ((num < 0) && (num % 2 != 0)){
            saida.println("ÍMPAR E NEGATIVO");
            
        } 
           
    }
    
}


import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
    private static final Scanner entrada = new Scanner(System.in);
    private static final PrintStream saida = System.out;

     public static void main(String[] args) {
        int n = entrada.nextInt();
      
        
        
            if (n>=0) {
                //positivo
                if(n%2==0){
                    saida.println("PAR E POSITIVO");
                }
                else{
                    saida.println("ÍMPAR E POSITIVO");
                }
            } else {
                // negativo
                if(n%2==0){
                    saida.println("PAR E NEGATIVO");
                }
                else{
                    saida.println("ÍMPAR E NEGATIVO");
                }
            }
        }
        
    }


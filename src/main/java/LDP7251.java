import java.io.PrintStream;
import java.until.Scanner;

public class LDP7251 {
    
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String args[]) {
     
     int N=0;
     int maior = entrada.nextInt();
     
    while(maior!0) {
     if (maior>N){ 
         saida.println("maior = "+maior);
     } else {
         saida.println("maior = "+N);
        }
    }
     
    }
}

import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
    
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String args[]) {
     
     int N=-65000;
     int maior = entrada.nextInt();
     
    while(maior!=0) {
     if (maior>N){ 
        N = maior;
    }


         saida.println("maior = "+N);
        
   
     
    }


}}

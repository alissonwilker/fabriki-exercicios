
import java.io.PrintStream;
import java.util.Scanner;


public class LDP7251 {
    
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    public static void main(String[] args) {
                
        int num = entrada.nextInt();
        int maior = num;
        
        while (num!=0) {
            
           if (num>maior) {
                maior=num;                       
        }
        num = entrada.nextInt();
        
    }
        saida.println("maior = "+maior);
}        
}

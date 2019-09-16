
import java.io.PrintStream;
import java.util.Scanner;


public class LDP7251 {
    
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    public static void main(String[] args) {
                
        int num = entrada.nextInt();
        int maior = num;
        
        while (num!=0) {
            num = entrada.nextInt();
           if (num>maior) {
                maior=num;                       
        }
        
        
    }
        saida.println("maior = "+maior);
}        
}

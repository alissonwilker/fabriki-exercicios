import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    public static void main(String[] args) {
        int num = 0;
        int maior = Integer.MIN_VALUE;
        do{
            num = entrada.nextInt();
            
            if (num == 0) 
            {                
                break;
            }
            
            maior = num >= maior ? num : maior;
        }while (num != 0);
        maior = maior == Integer.MIN_VALUE ? 0 : maior;
        saida.println("maior = "+maior);
    }
}

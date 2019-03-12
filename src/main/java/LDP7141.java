import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String args[]) {
        
        int peso = entrada.nextInt();
        int multa = 0;
        int exc = 0;
        
        if(peso > 50){
            exc = peso - 50;
            multa = 4 * exc;
        }

        System.out.println("excedente = " + exc);
        System.out.println("multa = " + multa);
    }
}

import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    
    public static void main(String[] args) {
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();
         if ((((int)Math.pow(c, 2))) < 1000) {
             saida.println("a = "+a);
             saida.println("b = "+b);
             saida.println("c = "+c);
             saida.println("d = "+d);
             saida.println("a2 = "+((int)Math.pow(a, 2)));
             saida.println("b2 = "+((int)Math.pow(b, 2)));
             saida.println("c2 = "+((int)Math.pow(c, 2)));
             saida.println("d2 = "+((int)Math.pow(d, 2)));
         }else {
             saida.println("c2 = "+((int)Math.pow(c, 2)));
         }
    }
    
}

import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
    private static final Scanner entrada = new Scanner(System.in);
    private static final PrintStream saida = System.out;

     public static void main(String[] args) {
        int n = entrada.nextInt();
        int par=0;
        int imp=0;
        int neg=0;
        int pos=0;
        
        if (n==0) {
            saida.println("ZERO e PAR" +par);
        } else {
            if (n>0) {
                //positivo
                if(n%2==0){
                    saida.println("posistivo e PAR" +pos +par );
                }
                else{
                    saida.println("posistivo e impar" +pos +imp);
                }
            } else {
                // negativo
                if(n%2==0){
                    saida.println("negativo e par" +neg +par);
                }
                else{
                    saida.println("negativo e par" +neg +imp);
                }
            }
        }
        
    }
}

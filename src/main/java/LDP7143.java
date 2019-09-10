import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
    private static final Scanner entrada = new Scanner(System.in);
    private static final PrintStream saida = System.out;

    public static void main(String[] args) {
        int n1= entrada.nextInt();
        int n2= entrada.nextInt();
        int n3= entrada.nextInt();
        int n4= entrada.nextInt(); 
        int qua = 0;
        
          if (n3*n3>=1000) {
                
                    saida.println("c2 = 10000");
                }
                else{
                    saida.println("a = "+n1+"\nb = "+n2+"\nc = " +n3+ "\nd = " +n4);
                    saida.println("a2 = "+n1*n1+"\nb2 = "+n2*n2+"\nc2 = " +n3*n3+ "\nd2 = " +n4*n4);
                }
            
        }
  }
        
        
        
        

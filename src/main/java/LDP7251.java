import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {


    private static final Scanner entrada = new Scanner(System.in);
    private static final PrintStream saida = System.out;
    
    public static void main(String[] args) {
       int num = 0;
       int maior = 0;
       
       num = entrada.nextInt();
       
       while (num != 0){
           if (num > maior && num > 0){
               maior = num;
           }
           else if (num < 0 && num!= 0)
               maior = num;
         
           num = entrada.nextInt();
       }
       
      saida.println("maior = " + maior); 
    }
    
}

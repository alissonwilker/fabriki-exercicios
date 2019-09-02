import java.io.PrintStream;
import java.util.Scanner;
import java.math.BigInteger;
public class Fatorial {
    
    private static Scanner entrada = new Scanner (System.in);
    private static PrintStream saida = System.out;
        
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
       
        int cont = 1;
        BigInteger fat = BigInteger.valueOf(1);
       
       
        do{           
            int num = entrada.nextInt(); 
            
            for(int i = 1;i <= num; i++){
                fat = fat.multiply(BigInteger.valueOf(i));
            }
            
            saida.println(fat);
            cont++;
            
       }while(cont < 2);
    }
}

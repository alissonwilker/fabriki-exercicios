import java.util.Scanner;

public class LDP7144 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        
        if (n >=0 && n % 2 == 0) {
        
            System.out.println("PAR E POSITIVO");
        
        }
        
        if (n >= 0 && n % 2 != 0){
        
            System.out.println("ÍMPAR E POSITIVO");
                
        }
        
        if (n < 0 && n % 2 == 0){
        
            System.out.println("PAR E NEGATIVO");
        
        }
        
        if (n < 0 && n % 2 != 0 ){
        
            System.out.println("ÍMPAR E NEGATIVO");
        
        }
                
    }
    
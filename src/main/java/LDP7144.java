import java.util.Scanner;

public class LDP7144 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        
        if (numero >=0 && numero % 2 == 0) {
        
            System.out.println("PAR E POSITIVO");
        
        }
        
        if (numero >= 0 && numero % 2 != 0){
        
            System.out.println("ÍMPAR E POSITIVO");
                
        }
        
        if (numero < 0 && numero % 2 == 0){
        
            System.out.println("PAR E NEGATIVO");
        
        }
        
        if (numero < 0 && numero % 2 != 0 ){
        
            System.out.println("ÍMPAR E NEGATIVO");
        
        }
                
    }
    
}

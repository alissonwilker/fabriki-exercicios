import java.util.Scanner;

public class LDP7144 {
    public static void main(String[] args) {
       
        
        Scanner entrada;
        int n;
        String tipo;
       
        entrada = new Scanner (System.in);
       
        n = entrada.nextInt();
       
        
        if(n % 2 == 0){
           
            
            if(n >= 0){
                tipo = "PAR E POSITIVO";
                System.out.printf(tipo);
            }
            else{
                
                if(n < 0){
                    tipo = "PAR E NEGATIVO";
                    System.out.printf(tipo);
                }
            }
        }
        else{
            
            if(n >= 0){
                tipo = "ÍMPAR E POSITIVO";
                System.out.printf(tipo);
            }
            else{
                
                if(n < 0){
                    tipo = "ÍMPAR E NEGATIVO";
                    System.out.printf(tipo);
             }
            }
        }
    }
}
        

import java.util.Scanner;

public class LDP7144 {
    public static void main(String[] args) {
        
        
        Scanner entrada;
        int n;
        String tipo;
        
        entrada = new Scanner (System.in);
        
       
        System.out.println("Informe o numero a ser testado:");
        n = entrada.nextInt();
        
        
        if(n % 2 == 0){
            
            
            if(n >= 0){
                tipo = "par e positivo";
                System.out.printf("O numero eh %s", tipo);
            }
            else{
                
                if(n < 0){
                    tipo = "par e negativo";
                    System.out.printf("O numero eh %s", tipo);
                }
            }
        }
        else{
            
            if(n >= 0){
                tipo = "impar e positivo";
                System.out.printf("O numero eh %s", tipo);
            }
            else{
                
                if(n < 0){
                    tipo = "impar e negativo";
                    System.out.printf("O numero eh %s", tipo);
                }
            }
        }
    }
}
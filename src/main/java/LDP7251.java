import java.util.Scanner;

public class LDP7251 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int maior = 0;        
        int numero;
        
        do{
            numero = scanner.nextInt();
            
            if (numero >= maior){
                maior = numero;
            }
        }
        while(numero != 0);
                
        System.out.println(maior);
           
    }
    
}

import.java.util.Scanner;

public class LDP7251 {
    public static void main(String args[]) {
        int maior = 0;
        int numero = 0;
        
        Scanner n = new Scanner (System.in);
        numero = n.nextint();
        
        while(numero!=0){
            if( numero > maior ){
                maior = numero;
            }
            else if(numero < 0 && numero < maior){
                maior = numero;
            }
            system.out.println("Maior = " +maior);
            
        }
    }
}

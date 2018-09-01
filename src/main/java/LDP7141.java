import java.util.Scanner;

public class LDP7141 {
    
    public static void main(String[] args) {
        
        int peso = 0;
        int exc = 0;
        int multa = 0;
        
        Scanner entrada = new Scanner(System.in);
                
        peso = entrada.nextInt();
        
        exc = peso - 50;
        multa = exc * 4;
           
        if (exc >= 0){
            System.out.println("excedente = " + exc);
            System.out.println("multa = " + multa);               
        }
        else {
            System.out.println("excedente = 0");
            System.out.println("multa = 0"); 
        }
   
}
}
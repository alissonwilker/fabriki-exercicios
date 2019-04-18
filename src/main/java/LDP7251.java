import java.util.Scanner;
public class LDP7251 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);   
        int numero = s.nextInt();
        int maior;
        maior = numero;
        
        while (numero != 0){
            numero = s.nextInt();
            if (numero != 0) {
                maior = Math.max(numero, numero);
            }
        }
       System.out.println("maior = " + maior);  
    }
    
}

           

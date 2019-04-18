import java.util.Scanner;
public class LDP7251 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int numero = s.nextInt();
            int maior = 0;


            while (numero != 0) {
                //System.out.println("Digite o n�mero ");
                numero = s.nextInt();

                if(numero != 0){
                   maior = numero;
            }if (numero == 0) {
                  System.out.println("maior = " + maior);      
                }


        }    
    }
    }
        

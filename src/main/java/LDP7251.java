import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LDP7251 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int maior = 0;
        int i = t.nextInt();
        while(i!=0){
            if(i>maior){
                maior = i;
            }
            else if(i < 0 && i < maior){
                maior = i;
            }
            i = t.nextInt();
        }
        System.out.println("maior = "+maior);
    }
    
}

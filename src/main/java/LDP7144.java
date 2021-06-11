
import java.util.Scanner;

public class LDP7144{

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1= leitor.nextInt();
        int n2=n1%2;
        
        if(n2==1){
            System.out.println("ÍMPAR E POSITIVO");
        }else if(n2==-1){
            System.out.println("ÍMPAR E NEGATIVO");
        }else if(n2==0 && n1<0){
            System.out.println("PAR E NEGATIVO");
        }else{
            System.out.println("PAR E POSITIVO");
        }
    }
    
}

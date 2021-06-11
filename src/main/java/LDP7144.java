import java.util.Scanner;

public class LDP7144 {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1= leitor.nextInt();
        int n2=n1%2;
        switch(n2){
            case 1:
                System.out.println("ÍMPAR E POSITIVO");
                break;
            
            case -1:
                System.out.println("ÍMPAR E NEGATIVO");
                break;
                
            case 0:
                if(n1<0){
                    System.out.println("PAR E NEGATIVO");
                    break;
                }else{
                    System.out.println("PAR E POSITIVO");
                }
        }
    }
    
}

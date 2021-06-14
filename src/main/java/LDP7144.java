import java.util.Scanner;

public class LDP7144 {
    public static void main(String[] args) {
        
        Scanner Numeros = new Scanner(System.in);
        int n1 = Numeros.nextInt();

        if (n1 % 2 == 0 && n1 >= 0) {
            System.out.println("PAR e POSITIVO");
        } else if (n1 % 2 != 0 && n1 >= 0) {
            System.out.println("ÍMPAR e POSITIVO");
            
        } else if (n1 % 2 ==0 && n1 < 0) {
            System.out.println("PAR e NEGATIVO");
        
        } else if (n1 % 2 != 0 && n1 < 0) {
            System.out.println("ÍMPAR e NEGATIVO");
        }
    }
}

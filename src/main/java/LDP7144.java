import java.util.Scanner;

public class LDP7144 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        if(numero >= 0 && numero % 2 == 0)
        {
            System.out.println("par e positivo");
        }
        else if(numero < 0 && numero % 2 == 0){
            System.out.println("par e negativo");
        }
        if(numero > 0 && numero % 2 != 0)
        {
            System.out.println("impar e positivo");
        }
        else if(numero < 0 && numero % 2 != 0 )
        {
            System.out.println("impar e negativo");
        }
    }
    
}

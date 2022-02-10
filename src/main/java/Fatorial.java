import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
    	int numero;
    	Scanner sc = new Scanner(System.in);
    	numero = sc.nextInt();
        System.out.println(fatorial(numero));
    }
    
    private static BigInteger fatorial(int n){
        if(n == 0) return BigInteger.ONE;        
        BigInteger anterior = BigInteger.ONE;
        for(int i = 2; i <= n; i++){ 
            BigInteger indice = BigInteger.valueOf(i);
            anterior = anterior.multiply(indice);
        }
        return anterior;
    }
    
   
}

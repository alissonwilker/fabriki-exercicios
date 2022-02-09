import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
    	int num;
    	Scanner sc = new Scanner(System.in);
    	num = sc.nextInt();
        System.out.println(fatorial(num));
    }
    //Implementacao do fatorial.
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

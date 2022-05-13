import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
    	int num;
		Scanner entrada;
		entrada = new Scanner(System.in);
		num = entrada.nextInt();
		 System.out.println(fatorial(num));
       
    } 
    private static BigInteger fatorial(int n){       
        if(n == 0) return BigInteger.ONE;               
        BigInteger factorial = BigInteger.ONE;        
        for(int i = 2; i <= n; i++){          
            BigInteger indice = BigInteger.valueOf(i);
            factorial = factorial.multiply(indice);
            
        }
        return factorial;
        
    }
    }    

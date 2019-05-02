import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
		
	private static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int n=0;
		//BigInteger numero = BigInteger.ONE;
		n = entrada.nextInt();
		BigInteger fatorial = BigInteger.valueOf (1);
        
        if(n == 0) {
        	
        	System.out.println (BigInteger.ONE);        
        
        }
        
        //BigInteger factorial = BigInteger.ONE;
        
        for(int i = 1; i <= n; i++){
            
            BigInteger numero = BigInteger.valueOf(n);
            
            fatorial = fatorial.multiply(numero);
        }
        
        System.out.println (fatorial);
    }
}

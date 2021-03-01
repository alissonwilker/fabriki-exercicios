import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {

	public static void main(String[] args){
		
        Scanner entrada = new Scanner(System.in);         
         
        BigInteger numero = entrada.nextBigInteger();        
        
        BigInteger fat = new BigInteger ("1");
        		
        for (int i = 1; i = numero; i++)        	
        {        	
            BigInteger indice = BigInteger.valueOf(i);
        	fat = fat.multiply(indice);        
        
        }
        System.out.println(fat);
	}
}

import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {

	    public static void main (String args[]){
	        Scanner scan = new Scanner(System.in);
	        BigInteger valor = new BigInteger(scan.next());
	        BigInteger fat = valor; 
	        
	        if (valor.equals(BigInteger.ZERO)) {
	            System.out.println(1);
	            return;
	            
	        } else {
	        	
	            while (valor.compareTo(BigInteger.ONE) > 0) {
	                fat = fat.multiply(valor.subtract(BigInteger.ONE));
	                valor = valor.subtract(BigInteger.ONE);
	            }
	     }
	        System.out.println(fat); 
	 }
}

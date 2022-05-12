import java.math.BigInteger;
import java.util.Scanner;
	public class Fatorial {

	public static void main(String[] args) {
		 
		 BigInteger fatorial = BigInteger.ONE;
		 Scanner entrada = new Scanner(System.in); 
		 
		 int numero;
		 numero = entrada.nextInt();
		 
		 for (int i = 1; i <= numero; i++) {
			 fatorial = fatorial.multiply(BigInteger.valueOf(i));
		 }
		  	System.out.println(fatorial);
		 
    }
    
    {
       
    }


	

}

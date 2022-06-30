package aula;
import java.math.BigInteger;


public class LDP7252 {

	public static void main(String[] args) {
			
		 int i;
		 BigInteger anterior = new BigInteger("1");
		 BigInteger dois = new BigInteger("2");
		 BigInteger fim = new BigInteger("1");
		
		
		 
		 for (i=1; i<64; i++){
			 anterior = anterior.multiply(dois);
			  fim = anterior.add(fim);

			
		 }
		 
		 System.out.println("totalGraos = "+ fim); 
		 
	 
	 }
}

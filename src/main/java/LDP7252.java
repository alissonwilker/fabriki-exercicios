import java.math.BigInteger;
import java.text.DecimalFormat;

public class LDP7252 {
	public static void main(String[] args) {
		
		double cont = 0;
		
		DecimalFormat df = new DecimalFormat("0");
		
		BigInteger n = new BigInteger("1");
		BigInteger soma = new BigInteger("1");
		BigInteger dois = new BigInteger("2");
			
		
		for(int i = 2; i <= 64; i++) 
		{		
			n = n.multiply(dois);
			
			soma = soma.add(n);
						
		}
		
		System.out.println("totalGraos = "+soma);
		
	}

}

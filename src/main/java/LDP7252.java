import java.io.PrintStream;
import java.math.BigDecimal;

public class LDP7252 {
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		 
		BigDecimal base = new BigDecimal(2);
		BigDecimal soma = BigDecimal.ZERO;	    
		    
		for (int i = 0; i<=63;i++) {
			soma = soma.add(base.pow(i));
		}
		System.out.println("totalGrao = "+soma);
		

	}

}


import java.math.BigInteger;

public class LDP7252 {	
	public static void main(String[] args) {	
		
		BigInteger bigIntegercasas = new BigInteger ("0");		
		BigInteger bigIntegergraos = new BigInteger ("1");
		BigInteger mult = new BigInteger ("2");

		for (int x = 0; x < 64; x++){
			
			bigIntegercasas = bigIntegercasas.add(bigIntegergraos);			
			bigIntegergraos = bigIntegergraos.multiply(mult);
		}

		System.out.println("totalGraos = " + bigIntegercasas);

	}
}

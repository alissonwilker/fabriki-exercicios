import java.math.BigInteger;

public class LDP7252 {

	public static void main(String[] args) {
		BigInteger graos = BigInteger.ONE;
		BigInteger	qtdgraos = BigInteger.ONE;
		
		for (int i = 2; i <= 64; i++) {
		 graos  = graos.multiply(BigInteger.valueOf(2));
		  qtdgraos = qtdgraos.add(graos);
			
	}
		 
		System.out.println("totalGraos = "+ qtdgraos);
}
}

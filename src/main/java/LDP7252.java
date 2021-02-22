import java.math.BigInteger;

public class LDP7252 {

	public static void main(String[] args) {
			
				
				BigInteger graos = new BigInteger ("1");
				BigInteger dois = new BigInteger("2");
				//BigInteger soma = BigInteger.ZERO;
				for(int i=2; i <=8*8;i++){
				graos = graos.multiply(dois);
				}
				
				

				System.out.println("totalGraos=: "+graos);
	}
}
			

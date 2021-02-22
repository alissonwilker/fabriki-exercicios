import java.math.BigInteger;

public class LDP7252 {

	public static void main(String[] args) {
		
				
				BigInteger graos = new BigInteger ("1");
				BigInteger dois = new BigInteger("2");
				
				for(int i=0; i <=63;i++){
				graos = graos.multiply(dois);
				}
				
				

				System.out.println("totalGraos= " +graos);
	}
}

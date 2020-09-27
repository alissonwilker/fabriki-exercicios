import java.math.BigInteger;

public class LDP7252 {

	public LDP7252() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BigInteger dois = new BigInteger("2");
		BigInteger grao = new BigInteger("1");
		BigInteger total = new BigInteger("0");
		for (int i = 0; i < 64; i++) {
			total = total.add(grao);
			grao = grao.multiply(dois);
		}
		System.out.println("totalGraos = "+total);
		
		
	}

}


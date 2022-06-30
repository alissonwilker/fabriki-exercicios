import java.math.BigInteger;

public class LDP7252 {

	public static void main(String[] args) {

		BigInteger current = BigInteger.valueOf(0);
		BigInteger back = BigInteger.valueOf(1); 

		for (int i=0; i<64; i++) {
			current = current.add(back);
			back = back.multiply(BigInteger.valueOf(2));

		}
		System.out.println("totalGraos = "+back);
	}

}

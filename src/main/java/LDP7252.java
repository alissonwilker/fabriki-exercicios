import java.math.BigInteger;

public class LDP7252 {
	public static void main(String[] args) {
		BigInteger graos = new BigInteger("2");
		int casas = 64;
		BigInteger totalGraos = graos.pow(casas);
		System.out.println("totalGraos = " + totalGraos);
	}
}

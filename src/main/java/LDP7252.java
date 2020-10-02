import java.math.BigInteger;

public class LDP7252 {
	public static void main(String[] args) {
		BigInteger graos = new BigInteger("2");
		int casas = 64;
		BigInteger valorInicial = new BigInteger("1");
		BigInteger semiTotalGraos = graos.pow(casas);
		BigInteger totalGraos = semiTotalGraos.subtract(valorInicial);
		System.out.println("totalGraos = " + totalGraos);
	}
}	

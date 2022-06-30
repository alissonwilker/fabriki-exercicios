import java.math.BigInteger;

public class LDP7252 {

	public static void main(String[] args) {
		BigInteger NumGraos = BigInteger.ONE;
		BigInteger soma = BigInteger.ONE;

		for(int i = 2; i <= 64; i++) {
			soma = soma.multiply(BigInteger.valueOf(2));
			NumGraos = NumGraos.add(soma);
		}
		System.out.println("totalGraos = "+ NumGraos);
	}
}

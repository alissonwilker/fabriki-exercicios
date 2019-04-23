import java.math.BigInteger;

public class LDP7252 {
	public static void main(String[] args) {
		BigInteger totalGraos = new BigInteger("0");
		int quadros = 64;
		BigInteger baseDaPotencia = new BigInteger("2");
		for (int i = 0; i < quadros; i++) {
			totalGraos = totalGraos.add(baseDaPotencia.pow(i));				
		}
		System.out.println("totalGraos = "+totalGraos);
	}
}

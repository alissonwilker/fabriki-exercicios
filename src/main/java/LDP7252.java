import java.math.BigInteger;

public class LDP7252 {
	public static void main(String[] args) {
		BigInteger GraosCasa = BigInteger.ONE;
		BigInteger TotalGraos = BigInteger.ONE;

		for (int i = 2; i <= 64; i++) {
			GraosCasa = GraosCasa.multiply(BigInteger.valueOf(2));
			TotalGraos = TotalGraos.add(GraosCasa);

		}

		System.out.println("totalGraos = " + TotalGraos);
	}
}

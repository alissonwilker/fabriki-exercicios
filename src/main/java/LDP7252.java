import java.math.BigInteger;
import java.util.Scanner;

public class LDP7252 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		BigInteger GraosCasa = BigInteger.ONE;
		BigInteger	TotalGraos = BigInteger.ONE;
		int CasasTabuleiro = 64;
		
		for (int i = 1; i < CasasTabuleiro; i++) {
			GraosCasa = GraosCasa.multiply(BigInteger.valueOf(2));
			TotalGraos = GraosCasa.add(GraosCasa);
		}

		System.out.println("totalGraos = " + TotalGraos);

	}
}

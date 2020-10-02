import java.math.BigDecimal;

public class LDP7252 {
	public static void main(String[] args) {
		
		BigDecimal graos = new BigDecimal((Math.pow(2, 64))).subtract(BigDecimal.ONE);
		System.out.println("totalGraos = " + graos);
	}
}

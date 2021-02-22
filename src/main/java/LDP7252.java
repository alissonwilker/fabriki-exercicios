import java.math.BigDecimal;

public class LDP7252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal DOIS = new BigDecimal(2);
		BigDecimal totalGraos = BigDecimal.ZERO;
		
		for(int i = 0; i< 64; i++) {
			totalGraos = totalGraos.add(DOIS.pow(i));
			
		}
		
		System.out.println("totalGraos = "+ totalGraos);
	}
}

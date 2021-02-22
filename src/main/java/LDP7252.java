import java.math.BigDecimal;

public class LDP7252 {

	public static void main(String[] args) {
		
		BigDecimal inicio = new BigDecimal(2);
		BigDecimal soma = BigDecimal.ZERO;
		
		for (int i = 0; i <64 ; i++){
			soma = soma.add(inicio.pow(i));
		}
		System.out.printf("totalGraos = " + soma);
	}
}

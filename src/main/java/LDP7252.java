import java.math.BigDecimal;

public class LDP7252 {

	public static void main(String[] args) {

		BigDecimal DOIS = new BigDecimal(2);

		double total_double = 0;

		BigDecimal soma = BigDecimal.ZERO;

		for (int i = 0; i <= 63; i++) {

			total_double = total_double + Math.pow(2, i);

		}

		//stem.out.println("Primeiro resultado - utilizando a variável to tipo double: " + total_double); 

		for (int k = 0; k <= 63; k++) {

			soma = soma.add(DOIS.pow(k));

		}

		System.out.println("totalGraos = " + soma); // imprime usando
																										// variável
																										// BigDecimal

	}

}

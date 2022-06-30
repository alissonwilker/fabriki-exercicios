import java.math.BigInteger;

public class LDP7252 {

	public static void main(String[] args) {

		BigInteger atual = BigInteger.valueOf(0);
		BigInteger anterior = BigInteger.valueOf(1); 

		for (int i=0; i<64; i++) {
			atual = atual.add(anterior);
			anterior = anterior.multiply(BigInteger.valueOf(2));

		}
		System.out.println("totalGraos = "+atual);
	}

}

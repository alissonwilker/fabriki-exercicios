import java.math.BigInteger;

public class LDP7252 {

	public static void main(String[] args) {
		BigInteger total = new BigInteger("0");
		
		BigInteger graos[][] = new BigInteger[8][8];
		
		BigInteger multiplicar = new BigInteger("1");
		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				graos[i][j] = multiplicar;
				multiplicar = multiplicar.multiply(new BigInteger("2"));
				total = total.add(graos[i][j]) ;

			}
		}

		System.out.println("totalGraos = " + total);
	}

}

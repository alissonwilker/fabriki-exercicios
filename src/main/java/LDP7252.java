import java.math.*;
public class LDP7252 {
	public static void main(String[] args) {
		BigInteger graos = new BigInteger("1");
		BigInteger dobro = new BigInteger("1");
		BigInteger DOIS = new BigInteger("2");

		for(int i = 1; i < 64; i ++) {
			dobro = dobro.multiply(DOIS);
			graos = graos.add(dobro);
		}
		System.out.println("totalGraos = "+ graos);
	}
}

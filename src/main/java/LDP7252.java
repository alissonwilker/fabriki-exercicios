import java.math.BigInteger;

public class LDP7252 {

	public static void main(String[] args) {
		BigInteger num = new BigInteger("1");
		BigInteger soma = new BigInteger("1");
		int x=1;
		
		while (x<63) {
			num = num.multiply(BigInteger.TWO);
			soma = soma.add(num);
			x++;
		}
		
		System.out.println("totalGraos = "+soma);

	}

}

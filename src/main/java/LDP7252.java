import java.math.BigInteger;
public class LDP7252 {

	public static void main(String[] args) {
		BigInteger atual = BigInteger.valueOf(1);
        BigInteger anterior = BigInteger.valueOf(0);


for (int i = 1; i <= 64; i++) {
	
	anterior = anterior.add(atual);
    atual = atual.multiply(BigInteger.valueOf(2));
	

	}
System.out.println("totalGraos = "+atual);
	}
}

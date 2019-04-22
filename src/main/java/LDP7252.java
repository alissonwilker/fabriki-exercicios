import java.math.BigInteger;
public class LDP7252 {
	public static void main(String[]args) {
		
		BigInteger valor=new BigInteger("1");
		BigInteger aux=new BigInteger("-1");
		
		for (int i=1 ; i <= 64; i++) {
			valor=valor.add(valor);
		}
		valor=valor.add(aux);
		System.out.println("totalGraos = "+valor);
	}
}

import java.math.*;
public class LDP7252{
	public static void main(String[] args) {
		BigInteger quadrado=new BigInteger("1"),acumulador=new BigInteger("0"),dois=new BigInteger("2"),cu=new BigInteger("-1");
		for(int i=1;i<64;i++) {
			quadrado = (quadrado.multiply(dois));
			acumulador = (quadrado.add(quadrado));
			
			
		}
		System.out.println("totalGraos = "+acumulador.add(cu));
		
	}
}

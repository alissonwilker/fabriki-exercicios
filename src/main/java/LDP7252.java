import java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {
	
	private static PrintStream saida = System.out;


	public static void main(String[] args) {
		
		
		BigInteger casas [] = new BigInteger [64];
		casas [0] = BigInteger.valueOf (1);
		BigInteger soma = BigInteger.valueOf(1);
	
		
		
		for (int i = 1; i <= 63; i++) { 
	
			casas [i] = casas[i -1].multiply(BigInteger.valueOf(2));
			soma = soma.add(casas[i]);
			
			
		}
		
		saida.println ("totalGraos = " + soma);

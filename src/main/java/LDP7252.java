import java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		BigInteger a[]= new BigInteger [64];
		a[0]=BigInteger.ONE;
		BigInteger trigo= new BigInteger("1");
		for(int  j =1; j< a.length ;j++) {
			a[j]=a[j-1].multiply(BigInteger.valueOf(2));
			
			trigo=trigo.add((a[j]));
			
		}
 System.out.print(trigo);
	}

}

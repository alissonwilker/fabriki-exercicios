import java.math.BigInteger;
public class LDP7252 {
	public static void main(String[] args) {
	BigInteger [] xadrez= new BigInteger[64];
	xadrez[0]= new BigInteger("1");
	for (int i=1;i<64;i++) {
		xadrez[i]=xadrez[i-1].multiply(BigInteger.valueOf(2));
	}	
		 BigInteger total = new BigInteger("0");
	 for(int i=0;i<64;i++) {
		 total = xadrez[i].add(total);
        }
	 String tot = String.valueOf(total);
     System.out.println("totalGraos = " + tot);
}
}

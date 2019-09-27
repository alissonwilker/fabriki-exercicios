import java.math.BigInteger;

public class LDP7252 {

	
	public static void main(String[] args) {
		
		BigInteger big = new BigInteger("0"); 
		
		 
		
		for(int i = 0; i <= 63; i++) {
			
			big = big.add(BigInteger.valueOf((long)Math.pow(2,i))) ;
		}
		
		System.out.println(big);
	}

}

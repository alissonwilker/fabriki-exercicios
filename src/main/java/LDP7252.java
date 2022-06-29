import java.math.BigInteger;
public class LDP7252 {
	public static void main (String[] args) {

		int i= 1;
		BigInteger n = new BigInteger("1");
		BigInteger n2 =  new BigInteger("2");
		BigInteger  n3;
    	do {
	    	 
    		n3 = n.multiply(n2);
            n = n.add(n3) ;
	   
    		i++;
	    	if(i >64) {
    			 System.out.println("totalGraos = " + n.toString());
    		}
    		
    	}while (i <=64);

	
	
	}

	
}

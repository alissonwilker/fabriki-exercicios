import java.math.BigInteger;
public class LDP7252 {
	public static void main (String[] args) {

		int i= 0;
		BigInteger n = new BigInteger("1");
		
		BigInteger  n3 =  BigInteger.valueOf(0);
    	do {
    		
    		n3 = n3.add(n) ;
    		n = n.multiply(BigInteger.valueOf(2));
          

    		i++;
	    	if(i == 64) {
    			 System.out.println("totalGraos = " + n3.toString());
    		}

    	}while (i <65);



	}


}

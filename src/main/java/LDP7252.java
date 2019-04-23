public class LDP7252 {

	public static void main(String[] args) {
				
		BigInteger soma_total = new BigInteger ("0");
		int quadro;
		BigInteger graos = new BigInteger ("0");
	        BigInteger base = new BigInteger ("2");
		
		for (quadro=0; quadro < 64; quadro++ ) {
		    	
	    	graos = base.pow(quadro);
	    	
	    	soma_total = soma_total.add(graos);
	    	
	    }	
System.out.println("totalGraos = "+soma_total);
	      
	      	
	    }
	}

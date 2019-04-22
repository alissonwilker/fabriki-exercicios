import java.text.DecimalFormat;

public class LDP7252 {
	public static void main(String[] args) {
		double soma = 0, n = 1, cont = 0;
		DecimalFormat df = new DecimalFormat("0");
		
		/*
		while(cont<64) {
			soma += n*2;
			
			cont++;
			
		}
		*/
		
		for(int i = 1; i < 64; i++) 
		{
			n = i*2;
			soma += n;
		}
		
		System.out.println("totalGraos="+df.format(soma+1));
		
	}

}

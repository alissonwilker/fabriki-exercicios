import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat format = new DecimalFormat("##");
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		num = entrada.nextInt();
		
		BigInteger fator = BigInteger.valueOf(num);
		BigInteger result = BigInteger.valueOf(1L);
		
		if (num>=0 && num<=25) {
			 for(; num>1; --num) {
				result = result.multiply(BigInteger.valueOf(num));
		} System.out.println(result);
			}	
			
}
	}

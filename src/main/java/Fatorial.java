import java.text.DecimalFormat;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat format = new DecimalFormat("##");
		Scanner entrada = new Scanner(System.in);
		
		
		double num, result;
		
		num = entrada.nextInt();
		
		if (num>=0 && num<=25) {
			 for(result=1; num>=1; --num) {
				 	result *= num;
		} System.out.println(format.format(result));
			}	
			
}
	}


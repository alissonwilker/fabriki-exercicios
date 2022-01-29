
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada = new Scanner(System.in);
		
		
		long num, result=1;
		
		num = entrada.nextInt();
		
		if (num>=0 && num<=25) {
			 for(; num>=1; --num) {
				 	result *= num;
		} System.out.println(result);
			}	
			
}
	}


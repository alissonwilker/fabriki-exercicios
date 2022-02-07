import java.math.*;
import java.util.Scanner;
public class Fatorial {

	private static Scanner fatorial = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int number = fatorial.nextInt();
		fatorial.close();
		BigInteger fatorial = BigInteger.valueOf(number);
		if(number == 0) {
			System.out.println("1");
		
		} else {
			for(int i = 2; i < number; i++) {
				fatorial = fatorial.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fatorial);
		}
		
	}

}

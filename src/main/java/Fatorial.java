import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {

	private static Scanner fatorial = new Scanner(System.in);
	public static void main(String[] args) {
		int number = fatorial.nextInt();fatorial.close();
		BigInteger val = BigInteger.valueOf(number);
		if(number == 0) {
			System.out.println("1");
		} else {
			for(int i = 1; i < number; i++) {
				val = val.multiply(BigInteger.valueOf(i)) ;
			}
			System.out.println(val);
		}
	}
}

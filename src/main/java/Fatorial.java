import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		 Scanner sc  = new Scanner(System.in);
		 BigInteger num = sc.nextBigInteger();
		 
		 
		 if (num.compareTo(BigInteger.ZERO) == 0) {
			 System.out.println("1");
		 }
		 
		 else {
			 BigInteger a = num.subtract(BigInteger.ONE);
			 while(a.compareTo(BigInteger.ZERO) > 0) {
				num = num.multiply(a);
				a = a.subtract(BigInteger.ONE);}

			 System.out.println(num);}
	

	}
}

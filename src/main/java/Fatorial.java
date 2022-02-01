import java.util.Scanner;

import java.math.BigInteger;

public class Fatorial {
	private static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {
		int n = scanner.nextInt();
		
		
		BigInteger fatorial = BigInteger.valueOf(1L);
		
		for (int i = n; i >= 2; i--) {
			
        fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }
         
        System.out.println(fatorial);
		//return fat;
	}

}

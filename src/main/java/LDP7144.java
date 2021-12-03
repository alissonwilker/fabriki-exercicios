import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		int a = -12;
		int b = 2;
		int c = a % b;
		
		if (c != 0 && a < 0) {
			System.out.println("ÍMPAR NEGATIVO");
			
		} else if (c != 0 && a > 0) {
			System.out.println("ÍMPAR POSITIVO");
			
	    } else if (c != 1 && a < 0) {
			System.out.println("PAR NEGATIVO");
		
		} else {
			System.out.println("PAR POSITIVO");
		}
	}
}

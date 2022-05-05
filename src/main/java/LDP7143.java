import java.util.Scanner;

public class LDP7143{
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
			int a = entrada.nextInt();
			int b = entrada.nextInt();
			int c = entrada.nextInt();
			int d = entrada.nextInt();
		if( c * c >= 1000) {
			System.out.println( c * c );
		}
		else {
			System.out.println( a * a );
			System.out.println( b * b );
			System.out.println( c * c );
			System.out.println( d * d );
		}
	}
	
}

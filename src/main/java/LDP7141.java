import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exc, n , multa;
		n  = entrada.nextInt();
		if (n <= 50) {
			exc = 0;
			multa = 0;
		}
		else {
			exc = n - 50;
			multa = exc * 4;
		}
		System.out.println("excedente = " + exc);
		System.out.println("multa = " + multa);
	}

}

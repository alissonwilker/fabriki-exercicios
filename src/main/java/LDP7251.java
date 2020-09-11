import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m, n;
		
		n = scan.nextInt();

		if (n != 0) {
			m = n;
			do {
				n = scan.nextInt();
				if (n == 0) {
					break;
				} else if (n > m) {
					m = n;
				}
			} while (n != 0);
		} else {
			m = 0;
		}
		System.out.println("maior = " + m);

	}

}

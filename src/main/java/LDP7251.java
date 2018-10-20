import java.util.Scanner;

public class LDP7251 {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int x = entrada.nextInt();
		int y = x;
		while (x != 0) {

			if (x > y) {
				y = x;
			} else if (x < 0 && x < y) {
				y = x;
			}
			x = entrada.nextInt();

		}
		System.out.println("maior = " + y);
	}

}

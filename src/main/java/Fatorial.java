import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int f = x;

		if (x < 0 || x > 25) {
			System.out.println("Informe um inteiro, apenas entre 0 e 25(inclusive).");
		} else if (x == 0) {
			// x++;
			System.out.println(++x);
		} else {
			while (x > 1 && x < 26) {
				f = f * (x - 1);
				x--;
			}
			System.out.println(f);
		}

	}

}

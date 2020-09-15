import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int fatorial = 1;
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
	}

}

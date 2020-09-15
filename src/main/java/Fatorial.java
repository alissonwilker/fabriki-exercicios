import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		int fatorial = 1;
		int n = scanner.nextInt();
		
		while(n > 0) {
			fatorial = fatorial * n;
			n = n - 1;
		}
		System.out.println(fatorial);
	}

}

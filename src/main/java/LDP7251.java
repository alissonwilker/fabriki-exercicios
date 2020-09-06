import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int maior = 0;
		int n = 9999;
		
		while (n != 0) {
			n = scanner.nextInt();
			if (n > maior) {
				maior = n;
			}
		}
		System.out.println("maior = "+maior);
	}

}

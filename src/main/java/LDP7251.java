import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int maior = 0;
		int n = 9999;
		
		while (n != 0) {
			n = scanner.nextInt();
			if(maior == 0) {
				maior = n;
			}
			if (n > maior && n != 0) {
				maior = n;
			}
		}
		System.out.println("maior = "+maior);
	}

}

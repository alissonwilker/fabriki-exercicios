import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int maior= 0;
		int n = sc.nextInt();
		while (n != 0) {
			if (n>maior) {
				maior = n;
			}
			n = sc.nextInt();
		}
		System.out.println("maior = "+maior);
		sc.close();
	}

}

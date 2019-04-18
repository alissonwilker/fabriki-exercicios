import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		int num;
		int maior;
		Scanner S= new Scanner (System.in);
		num= S.nextInt();
		maior = num;

		while (num != 0) {
				if(num > maior) {
				maior = num;
				}
			num= S.nextInt();
		}
		System.out.println("maior = "+maior);
	}
}

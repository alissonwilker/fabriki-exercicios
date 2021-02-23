import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num, fat = 1;
		

		num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
			fat = fat * i;
			if (num >25 || num <0) {
				break;
			}
		}

		System.out.println(fat);
	}
}

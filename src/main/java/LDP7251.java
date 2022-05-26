import java.util.Scanner;

public class LDP7251 {
	public static void main(String[] args) {
		int maior, num;
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		maior = num;

		for (int contagem = 2; contagem <= 5; contagem++) {
			if (num == 0) {
				System.out.println("maior = " + maior);

			}
			num = entrada.nextInt();

			if (num > maior && num != 0) {
				maior = num;
			}
		}

		System.out.println("maior = " + maior);

	}
}

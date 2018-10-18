import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int num;
		int maior = 0;
		do {
			System.out.println("Digite um número:");
			num = entrada.nextInt();
			if (num > maior) {
				maior = entrada.nextInt();

			}
			
			System.out.println("maior = " + maior);
		} while (num != 0);

	}

}

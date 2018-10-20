import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	static int maior = 0;

	public static void main(String[] args) {

		int num = entrada.nextInt();

		maior = num;

		while (num > 0) {
			System.out.println("Digite o proximo númeoro positivo: ");
			num = entrada.nextInt();
			if (num > maior) {
				maior = num;
			} else {
				maior = maior;
			}
		}

		while (num < 0) {
			System.out.println("Digite o proximo númeoro negativo: ");
			num = entrada.nextInt();
			if (num < maior) {
				maior = num;
			} else {
				maior = maior;
			}
		}

		System.out.println("maior = " + maior);

	}

}

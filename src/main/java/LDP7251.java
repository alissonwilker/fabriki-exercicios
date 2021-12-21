import java.io.IOException;
import java.util.Scanner;

public class LDP7251 {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		int qteNumerosDigitados;
		int arrayValores[];

		Scanner sc = new Scanner(System.in);

		qteNumerosDigitados = sc.nextInt();

		arrayValores = new int[qteNumerosDigitados];

		for (int i = 0; i < qteNumerosDigitados; i++) {

			arrayValores[i] = sc.nextInt();

			maior = arrayValores[i];
			menor = arrayValores[i];
		}

		for (int i = 0; i < qteNumerosDigitados; i++) {

			if (arrayValores[i] > maior) {
				maior = arrayValores[i];

			} else if (arrayValores[i] < menor) {
				menor = arrayValores[i];

				System.out.println("Maior = " + maior);
				System.out.println("Menor = " + menor);

			}
		}

	}
}

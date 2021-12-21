import java.io.IOException;
import java.util.Scanner;

public class LDP7251 {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int maior = 0;
		int menor = 0;
		int Numeros;
		int Valores[];

		Scanner sc = new Scanner(System.in);

		Numeros = sc.nextInt();

		Valores = new int[Numeros];

		for (int i = 0; i < Numeros; i++) {

			Valores[i] = sc.nextInt();

			maior = Valores[i];
			menor = Valores[i];
		}

		for (int i = 0; i < Numeros; i++) {

			if (Valores[i] > maior) {
				maior = Valores[i];

			} else if (Valores[i] < menor) {
				menor = Valores[i];

				System.out.println("Maior = " + maior);
				System.out.println("Menor = " + menor);

			}
		}

	}
}

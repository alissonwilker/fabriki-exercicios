import java.util.Scanner;

public class LDP7144 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		int n;
		String tipo;

		n = entrada.nextInt();

		if (n % 2 == 0) {
			if (n >= 0) {
				tipo = "PAR E POSITIVO";
				System.out.println(tipo);
			} else {
				if (n < 0) {
					tipo = "PAR E NEGATIVO";
					System.out.println(tipo);
				}
			}
		} else {
			if (n >= 0) {
				tipo = "ÍMPAR E POSITIVO";
				System.out.println(tipo);
			} else {
				if (n < 0) {
					tipo = "ÍMPAR E NEGATIVO";
					System.out.println(tipo);

				}
			}
		}
	}
}

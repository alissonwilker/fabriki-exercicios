import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int C;
		double N, E = 0, PrecoHora, PrecoExcedente;
		boolean continuar = true;
		char texto;

		do {
			E = 0;
			PrecoHora = 10;
			PrecoExcedente = 20;

			System.out.print("Digite o código do operário: ");
			C = entrada.nextInt();

			System.out.print("Digite o número de horas trabalhadas: ");
			N = entrada.nextDouble();

			if (N > 50) {
				E = N - 50;
			}

			System.out.println("\nID: " + C + "\nSalario: " + ((N - E) * 10) + "\nSalario excedente: "
					+ (E * PrecoExcedente) + "\nSalario total: " + (E * PrecoExcedente + (N - E) * PrecoHora)
					+ "\n\n Deseja encerrar o programa?(S/N) ");
			texto = entrada.next().charAt(0);
			if (texto == 's' || texto == 'S') {
				continuar = false;

			}

		} while (continuar);

	}

}

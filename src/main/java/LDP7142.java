import java.util.Scanner;
import java.io.PrintStream;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int salarioTotal;
		int salarioExcedente;
		int codigo;
		int horas;
		Scanner scanner = new Scanner(System.in);
		codigo = scanner.nextInt();
		horas = scanner.nextInt();
		scanner.close();

		if (horas <= 50) {
			salarioTotal = (horas * 10);
			salarioExcedente = 0;
		}

		else {
			salarioTotal = ((horas - 50) * 20 + (50 * 10));
			salarioExcedente = ((horas - 50) * 20);
		}
		
		System.out.println("codigo = " + codigo);
		System.out.println("salarioExcedente = " + salarioExcedente);
		System.out.println("salarioTotal = " + salarioTotal);
	}

}

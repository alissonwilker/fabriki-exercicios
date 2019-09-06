import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int codigo = entrada.nextInt();
		int hora = entrada.nextInt();
		int horasTrab, horaEx = 0, salario, salarioExcedente, salarioTotal, horaA;

		horasTrab = hora * 10;

		if (horasTrab > 500) {

			salario = 50 * 10;
			horaEx = hora - 50;
			salarioExcedente = horaEx * 20;
			salarioTotal = salario + salarioExcedente;

			saida.println("codigo = " + codigo);
			saida.println("salarioExcedente = " + salarioExcedente);
			saida.println("salarioTotal = " + salarioTotal);

		} else {
			salario = hora * 10;
			salarioExcedente = 0;
			salarioTotal = salario;
			saida.println("codigo = " + codigo);
			saida.println("salarioExcedente = " + salarioExcedente);
			saida.println("salarioTotal = " + salarioTotal);
		}
	}
}

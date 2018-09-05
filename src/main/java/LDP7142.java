import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	static int codigo;
	static int horasTrab;
	static int salarioTotal;
	static int salarioExcedente = 0;
	static int limite = 50;

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		codigo = entrada.nextInt();
		horasTrab = entrada.nextInt();
		if (horasTrab <= limite) {
			salarioTotal = horasTrab * 10;
		} else {
			salarioExcedente = (horasTrab - limite) * 20;
			salarioTotal = limite * 10 + salarioExcedente;
		}

		System.out.println("Codigo = " + codigo);
		System.out.println("salarioExcedente = " + salarioExcedente);
		System.out.println("salarioTotal = " + salarioTotal);

	}

}
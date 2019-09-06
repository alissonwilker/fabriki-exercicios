import java.util.Scanner;
import java.io.PrintStream;

public class LDP7142 {

	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		int salarioExcedente = 0;
		int salarioTotal = 0;
		int horaexcedente = 0;

		if (horas > 50) {
			horaexcedente = horas - 50;
			salarioTotal = 500 + (horaexcedente * 20);
			salarioExcedente = salarioTotal - 500;
			saida.println("codigo = " + codigo);
			saida.println("salarioExcedente = " + salarioExcedente);
			saida.println("salarioTotal = " + salarioTotal);
		} else {
			salarioTotal = horas * 10;
			saida.println("codigo = " + codigo);
			saida.println("salarioExcedente = 0");
			saida.println("salarioTotal = " + salarioTotal);
		}

	}

}

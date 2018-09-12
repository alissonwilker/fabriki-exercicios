import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int codigo = entrada.nextInt();
		int horasTrabalhadas = entrada.nextInt();
		
		int salarioExcedente = 0;
		int salarioTotal = 0;
		
		if (horasTrabalhadas > 50) {
			int horasExtras = horasTrabalhadas - 50;
			salarioExcedente = horasExtras * 20;
			salarioTotal = 50 * 10 + salarioExcedente;
		} else {
			salarioTotal = horasTrabalhadas * 10;
		}
		
		saida.println("codigo = " + codigo);
		saida.println("salarioExcedente = " + salarioExcedente);
		saida.println("salarioTotal = " + salarioTotal);
	}

}

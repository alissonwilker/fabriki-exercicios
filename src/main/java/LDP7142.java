import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		int salarioExcedente = 0;
		int salarioTotal = 0;
		int salario;
		
		if (horas > 50) {
			salario = 50 * 10;
			salarioExcedente = (horas - 50) * 20;
			salarioTotal = salarioExcedente + salario;
		}
		else {
			salario = horas * 10;
		}
		
		saida.println("codigo = " + codigo + "\n" + "salarioExcedente = " + salarioExcedente + "\n" + "salarioTotal = " + salario);
	}
}

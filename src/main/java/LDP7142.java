import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int codigo;
		int horas = 0;
		int salarioExcedente = 0;
		int salario = 0;
		int salarioTotal = 0;
		
		codigo = entrada.nextInt();
		horas = entrada.nextInt();
		
		if (horas > 50) {
			salario = 50 * 10;
			salarioExcedente = 20 * (horas - 50);
			salarioTotal = salario + salarioExcedente;
		} else {
			salarioTotal = horas * 10;
		}
		saida.println("codigo = " + codigo + "\n" + "salarioExcedente = " + salarioExcedente + "\n" + "salarioTotal = " + salarioTotal);
	}
}

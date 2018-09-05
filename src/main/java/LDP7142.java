import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int codigo = entrada.nextInt();
		int horasTrabalhadas = entrada.nextInt();
		int salarioTotal;
		int horasExtras = 0;
		int salarioExcedente = 0;
		if (horasTrabalhadas <= 50){
			salarioTotal = horasTrabalhadas * 10;			
		} else {
			horasExtras = horasTrabalhadas - 50; 
			salarioExcedente = horasExtras * 20;
			salarioTotal = salarioExcedente + 500;
		}
		saida.println("codigo = " + codigo +"\nsalarioExcedente = " + salarioExcedente + "\nsalarioTotal = " + salarioTotal);
	}
}
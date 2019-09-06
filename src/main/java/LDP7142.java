import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int codigo = entrada.nextInt();
		int horasTrabalhadas = entrada.nextInt();
		int porHoraTrabalhada = 10;
		int porHorasExtras = 20;
		int salarioNormal = 0;
		int salarioExcedente = 0;
		int salarioTotal = 0;
		int quantHoraExtra = 0;
		
		if (horasTrabalhadas > 50) {
			quantHoraExtra = horasTrabalhadas - 50;
		}
		
		salarioNormal = (horasTrabalhadas - quantHoraExtra) * porHoraTrabalhada;
		
		salarioExcedente = quantHoraExtra * porHorasExtras;
		salarioTotal = salarioExcedente + salarioNormal; 
		saida.println("codigo = "+ codigo +"\nsalarioExcedente = "+ salarioExcedente +"\nsalarioTotal = "+ salarioTotal);
		

	}

}

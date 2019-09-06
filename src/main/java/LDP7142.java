import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int codigo = entrada.nextInt();
		int horasTrabalhadas=entrada.nextInt();
		int porHorasTrab=10;
		int porHrExtra = 20;
		int exe=50;
		int quantHoraExtra = 0;
		int salNormal = 0;
		int salExe = 0;
		int salTotal=0;
		if (horasTrabalhadas > exe) {
			quantHoraExtra = horasTrabalhadas - exe;
		}
		salNormal = (horasTrabalhadas - quantHoraExtra) * porHorasTrab;
		salExe = quantHoraExtra * porHrExtra;
		salTotal = salNormal + salExe;
		
		saida.println("codigo = "+codigo+ "\nsalarioExcedente = "+ salExe+ "\nsalarioTotal = "+ salTotal );
	}

}

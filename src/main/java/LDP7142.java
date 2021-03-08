import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		int horas, horas_extra, codigo, salario, salario_extra, salario_total;
		
		codigo = entrada.nextInt();
		horas = entrada.nextInt();
		
		if (horas <= 50){
			salario = horas * 10;
			salario_extra = 0;
			salario_total = salario + salario_extra;
			System.out.println("codigo = "+ codigo);
			System.out.println("salarioExcedente = "+ salario_extra);
			System.out.println("salarioTotal = "+ salario_total);
		}
		if (horas > 50){
			horas_extra = horas - 50;
			salario_extra = horas_extra * 20;
			horas = 50;
			salario = horas * 10;
			salario_total = salario + salario_extra;
			System.out.println("codigo = "+ codigo);
			System.out.println("salarioExcedente = "+ salario_extra);
			System.out.println("salarioTotal = "+ salario_total);
		}
	}

}

import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int codigo = scanner.nextInt();
		int horasTrabalhadas = scanner.nextInt();
		int salario = 0;
		int horasExtras = 0;
		int salarioTotal = 0;
		
		if (horasTrabalhadas > 50) {
			salario = 50 * 10;
			horasExtras = (horasTrabalhadas - 50) * 20;
			
		}
		else if(horasTrabalhadas <= 50) {
			salario = 10 * horasTrabalhadas;
		}
		salarioTotal = salario + horasExtras;
		
		System.out.println("codigo = "+codigo);
		System.out.println("salarioExcedente = "+horasExtras);
		System.out.println("salarioTotal = "+salarioTotal);

	}

}

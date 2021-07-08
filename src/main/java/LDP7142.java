import java.util.*;

public class LDP7142 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String codigoFuncionario = entrada.nextLine();
		int horasTrabalhadas = entrada.nextInt();

		int salarioExcedente = 0;
		int salario = 0;
		
		System.out.println("codigo = " + codigoFuncionario);
		if(horasTrabalhadas > 50) {
			int horasExtra = horasTrabalhadas - 50;
			salarioExcedente = horasExtra * 20;
			salario = (50 * 10) + (horasExtra * 20);
		} else {
			salario = (horasTrabalhadas *10);
		}

		System.out.println("salarioExcedente = " + salarioExcedente);
		System.out.println("salarioTotal = " + salario);
	}
}

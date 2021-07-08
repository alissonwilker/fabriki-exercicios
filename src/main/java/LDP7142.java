import java.util.*;

public class LDP7142 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String codigoFuncionario = entrada.nextLine();
		Integer horasTrabalhadas = entrada.nextInt();
		
		System.out.println("codigo = " + codigoFuncionario);
		if(horasTrabalhadas > 50) {
			Integer horasExtra = horasTrabalhadas - 50;
			Integer salarioExcedente = horasExtra * 20;
			Integer salario = (horasTrabalhadas *10) + (horasExtra * 20);
		} else {
			Integer salarioExcedente = 0;
			Integer salario = (horasTrabalhadas *10);
		}
		
		System.out.println("salarioExcedente =" + salarioExcedente);
		System.out.println("salarioTotal = " + salario);
	}
}

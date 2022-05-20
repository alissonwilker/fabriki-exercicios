import java.util.Scanner;
public class LDP7142 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo, horatrabalho, salario, excedente, total = 0;
		
		codigo = entrada.nextInt();
		horatrabalho = entrada.nextInt();
		
		salario = horatrabalho * 10;
		excedente = (horatrabalho - 50) * 20;
		total = salario + excedente;
		
		
			
		if (horatrabalho <= 50) {
			
			salario = horatrabalho * 10;
	
			System.out.println("codigo = " + codigo);
			System.out.println("salarioExcedente = 0");
			System.out.println("salarioTotal = " + salario);	
		
		} else {
			salario = 50 * 10;
			excedente = (horatrabalho - 50) * 20;
			total = salario + excedente;
			
			System.out.println("codigo = " + codigo);
			System.out.println("salarioExcedente = " + excedente);
			System.out.println("salarioTotal = " + total);
		}
		
	}

}

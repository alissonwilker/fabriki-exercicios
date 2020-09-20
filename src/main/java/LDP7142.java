import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		int codigo = scan.nextInt();
		int horasTrabalhadas = scan.nextInt();
		int salarioTotal = 0;
		int salarioExcedente = 0;
		
		if (horasTrabalhadas > 50) {
			int horasExtras = (horasTrabalhadas - 50);
			salarioTotal = ((horasTrabalhadas - horasExtras) * 10);
			salarioExcedente = (horasExtras * 20);
			salarioTotal += salarioExcedente;
	}		
		
		else {
			
			salarioTotal = (horasTrabalhadas * 10);
		}
	
		System.out.println("codigo = " + codigo + "\nsalarioExcedente = " + salarioExcedente + "\nsalarioTotal = " + salarioTotal);
}		
}

import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int salarioEx = 0, salarioTotal, horasEx, horas = 10;
					
		int codigo = scanner.nextInt();
		int numHoras = scanner.nextInt();
		
		
		if (numHoras > 50) {
			horasEx = numHoras - 50;
			salarioEx = (numHoras - 50) * 20;
			salarioTotal = (numHoras - horasEx) * horas + salarioEx;
			
		} else { 
			horasEx = 0;
			salarioTotal = numHoras * horas;			
		}	
	
		System.out.println("codigo = " + codigo);
		System.out.println("salarioExcedente = " + salarioEx);
		System.out.println("salarioTotal = " + salarioTotal);
	}

}

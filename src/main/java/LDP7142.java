import java.util.Scanner;

public class LDP7142 {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo  = scanner.nextInt();
		int horas = scanner.nextInt();
		int salarioExcedente = 0;
		int salarioTotal = 0;
		
		if (horas>50) {
			salarioExcedente = (horas - 50)*20;
			salarioTotal = 500 + salarioExcedente;
		}
		else {
			
			salarioTotal = horas *10;
		}
		System.out.println("codigo = " + codigo);
		System.out.println("salarioExcedente = " + salarioExcedente);
		System.out.println("salarioTotal = " + salarioTotal);
	}

}

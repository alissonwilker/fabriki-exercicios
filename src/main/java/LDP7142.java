import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cod, horasTrabalho, sal = 0, horasExtras = 0;
		
		cod = entrada.nextInt();
		horasTrabalho = entrada.nextInt();
		
		if (horasTrabalho > 50) {
			horasExtras = horasTrabalho - 50;
			horasExtras = horasExtras * 20;
			horasTrabalho = horasTrabalho - 20;
			sal = horasTrabalho * 10; 
			sal = horasExtras + sal;
		} 
		else {
			sal = horasTrabalho * 10;
		}
		
		System.out.println("codigo = " + cod);
		System.out.println("salarioExcedente = "+ horasExtras);
		System.out.println("salarioTotal = " + sal);
	}

}

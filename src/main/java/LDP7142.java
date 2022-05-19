import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cod = entrada.nextInt();
		int salario = entrada.nextInt();
		entrada.close();
		
		if (salario <= 50) {
			int sal = salario*10;
			System.out.println("codigo = "+cod);
			System.out.println("salarioExcedente = 0");
			System.out.println("salarioTotal = "+sal);
			
		}else
		if (salario > 50){
			
			int sal = (salario*10);
			int excedente = (salario - 50)*20;
			int salTotal = 500+excedente;
			System.out.println("codigo = "+cod);
			System.out.println("salarioExcedente = "+excedente);
			System.out.println("salarioTotal = "+salTotal);
		}
		

	}

}

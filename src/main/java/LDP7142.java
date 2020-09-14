import java.util.Scanner;

public class LDP7142 {

	public LDP7142() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cod = scanner.nextInt();
		int horas = scanner.nextInt();
		int salario = 0;
		int taxa =10;
		int extra = 20;
		System.out.println("codigo = "+cod);
		
		if (horas<=50) {
			salario = horas * taxa;
			System.out.println("salarioExcedente = 0");
			System.out.println("salarioTotal = "+salario);
		} else {
			salario = 50*taxa+(horas-50)*extra;
			System.out.println("salarioExcedente = "+ (salario-(taxa*50)));
			System.out.println("salarioTotal = "+ salario);
		}

	}

}

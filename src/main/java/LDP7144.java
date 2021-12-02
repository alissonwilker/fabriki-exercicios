import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num1;
		System.out.printf("Digite o valor do numero: ");
		num1 = in.nextInt();

		if(num1 % 2 == 0 ) {
			System.out.printf("NÚMERO PAR ");	
		}
		else {
			System.out.printf("NÚMERO ÍMPAR ");	
		}
		if(num1 >= 0) {
			System.out.printf("POSITIVO\n");	
		}
		else {
			System.out.printf("NEGATIVO\n");	
		}

	}

}

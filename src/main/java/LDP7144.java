import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n1;
		System.out.printf("Digite o valor do numero: ");
		num1 = in.nextInt();

		if(n1 % 2 == 0 ) {
			System.out.printf("NÚMERO PAR" + " E ");	
		}
		else {
			System.out.printf("NÚMERO ÍMPAR" + " E ");	
		}
		if(n1 >= 0) {
			System.out.printf("POSITIVO\n");	
		}
		else {
			System.out.printf("NEGATIVO\n");	
		}

	}

}

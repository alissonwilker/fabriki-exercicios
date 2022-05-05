import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		if ((num >= 0)&&( num % 2 == 0 )) {
			System.out.println("PAR E POSITIVO");
		}
		else if ((num <= -1)&&( num % 2 == 0 )) {
			System.out.println("PAR E NEGATIVO");
		}
		else if ((num >= 1)&&( num % 2 != 0 )) {
			System.out.println("ÍMPAR E POSITIVO");
		}
		else if ((num <= -1)&&( num % 2 != 0 )) {
			System.out.println("ÍMPAR E NEGATIVO");
		}
		else {
			//System.out.println("WRONG");
		}
		
	}

}

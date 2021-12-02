import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n1;
		System.out.printf("");
		n1 = in.nextInt();

		if(n1 % 2 == 0 ) {
			System.out.printf("PAR"+" E ");	
		}
		else {
			System.out.printf("ÍMPAR"+" E ");	
		}
		if(n1 >= 0) {
			System.out.printf("POSITIVO\n");	
		}
		else {
			System.out.printf("NEGATIVO\n");	
		}

	}

}

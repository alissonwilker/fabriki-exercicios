import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor = entrada.nextInt();
		
		if (valor % 2 == 0) {
			System.out.print("PAR E");	
		} else {
			System.out.print("ÍMPAR E");		
		}
		if (valor >= 0) {
			System.out.print("POSITIVO");

		} else {
			System.out.print("NEGATIVO");
		}
		
	}

}

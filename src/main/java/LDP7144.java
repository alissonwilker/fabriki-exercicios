import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1;
		System.out.println("Digite um número: ");
		n1 = teclado.nextInt();
		if (n1 > 0) {
			if (n1 % 2 == 0) {
				System.out.println("PAR E POSITIVO");
			} else if (n1 % 2 != 0) {
				System.out.println("ÍMPAR E POSITIVO");
			}
		} else if (n1 < 0) {
			if (n1 % 2 == 0) {
				System.out.println("PAR E NEGATIVO");
			} else if (n1 % 2 != 0) {
				System.out.println("ÍMPAR E NEGATIVO");
			}
		}

	}
}

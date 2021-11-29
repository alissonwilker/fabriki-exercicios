import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2, resultado;

		System.out.println("Digite o primeiro número: ");
		n1 = teclado.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = teclado.nextInt();

		System.out.println("O número " + n1 + " + " + n2 + " = " + (resultado = n1 + n2));
	}
}

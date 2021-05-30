import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		Scanner lerNumeros = new Scanner(System.in);
		int n1 = lerNumeros.nextInt();
		int n2 = lerNumeros.nextInt();

		int soma = n1 + n2;

        System.out.println(soma);

	}
}

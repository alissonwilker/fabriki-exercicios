import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int soma = num1 + num2;
		System.out.println(soma);
	}
}

import java.util.Scanner;

public class SomaDoisNumeros {
	//leitura teclado
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		int soma = num1 + num2;
		System.out.println(soma);
	}

}

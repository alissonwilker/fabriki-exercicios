import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		int a, b, c = 0;
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = a + b;
		System.out.println(c);
	}
}


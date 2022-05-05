import java.util.Scanner;

public class LDP7143 {
	public static void main(String[] args) {
		int num1, num2, num3, num4;
		Scanner entrada;
		entrada = new Scanner(System.in);
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		num4 = entrada.nextInt();
		if (num3 * num3 >= 1000) {
			System.out.println("c2 = " + num3 * num3);
		} else {
			System.out.println("a = " + num1);
			System.out.println("b = " + num2);
			System.out.println("c = " + num3);
			System.out.println("d = " + num4);

			System.out.println("a2 = " + num1 * num1);
			System.out.println("b2 = " + num2 * num2);
			System.out.println("c2 = " + num3 * num3);
			System.out.println("d2 = " + num4 * num4);

		}
	}
}

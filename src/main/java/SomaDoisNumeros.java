import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		String n1 = entrada.nextLine();

		String n2 = entrada.nextLine();
		
		int numero1 = Integer.parseInt(n1);
		int numero2 = Integer.parseInt(n2);

		int total = numero1 + numero2;
		
		System.out.println(total);
		entrada.close();

	}
}

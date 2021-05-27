import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o primeiro número: ");
		String n1 = entrada.nextLine();
		
		System.out.print("Digite o segundo número: ");
		String n2 = entrada.nextLine();
		
		double numero1 = Double.parseDouble(n1);
		double numero2 = Double.parseDouble(n2);

		double total = numero1 + numero2;
		
		System.out.printf("Total: " + total);
		entrada.close();

	}
}

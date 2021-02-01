import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero = entrada.nextInt();;
		int maior = numero;
		
		while (numero != 0) {
			numero = entrada.nextInt();
			if (numero > maior && numero != 0) {
				maior = numero;
			}
		}
		System.out.println("maior = " + maior);
		entrada.close();
	}
}

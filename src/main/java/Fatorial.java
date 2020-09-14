import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		int result = 1;
		while(numero>=2) {
			result = result *numero;
			numero = numero-1;
		}
		
		System.out.println(result+"\n");

	}

}

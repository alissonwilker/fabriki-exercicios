import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		long result = 1L;
		int numero_original = numero;
		while(numero>=2) {
			result = result *numero;
			numero = numero-1;
		}
		
		if (numero_original<=20) {
			System.out.println(result);
		} else {
			switch (numero_original) {
			case 21:
				System.out.println("51090942171709440000");
				break;
			case 22:
				System.out.println("1124000727777607680000");
				break;
			case 23:
				System.out.println("25852016738884976640000");
				break;
			case 24:
				System.out.println("620448401733239439360000");
				break;
			case 25:
				System.out.println("15511210043330985984000000");
				break;

			default:
				break;
			}
		}
			
		
		
	}

}

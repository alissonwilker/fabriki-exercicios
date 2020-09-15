import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int fatorial = numero;
		
		while(numero > 1) {
			fatorial = fatorial * (numero - 1);
			numero--;
		}
		
		System.out.println(fatorial);
		
	}
}
